package lspace.ns

import argonaut.{EncodeJson, Json, PrettyParams}
import cats.effect.IO
import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http.{Request, Response, Status}
import com.twitter.finagle.param.Stats
import com.twitter.io.Buf
import com.twitter.server.TwitterServer
import com.twitter.util.Await
import io.finch
import io.finch.{Bootstrap, Endpoint, Ok, Output}
import lspace.client.User
import lspace.librarian.process.traversal.P
import lspace.librarian.process.traversal.Step
import lspace.librarian.provider.mem.MemGraph
import lspace.librarian.structure._
import lspace.parse.JsonLD
import lspace.ns._
import lspace.services.rest.endpoints.JsonLDModule
import shapeless.{:+:, CNil}

import scala.collection.mutable

object NSService extends TwitterServer {

  lazy val graph: Graph = MemGraph("https://ns.l-space.eu/")
  val context           = graph.iri
  lazy val nsService    = NSService(context, graph)

  P.predicates.map(_.ontology).foreach(graph.ns.ontologies.store)
  Step.steps.map(_.ontology).foreach(graph.ns.ontologies.store)
  graph.ns.ontologies.store(File.ontology)
  graph.ns.ontologies.store(Directory.ontology)
  graph.ns.ontologies.store(User.ontology)
  File.properties.foreach(graph.ns.properties.store)
  Directory.properties.foreach(graph.ns.properties.store)
  User.properties.foreach(graph.ns.properties.store)

  lazy val port: Int = 8080

  import JsonLDModule.Encode._

  lazy val api: Service[Request, Response] = Bootstrap
    .configure(enableMethodNotAllowed = true, enableUnsupportedMediaType = true)
    .serve[JsonLDModule.JsonLD :+: CNil](nsService.api)
    .toService

  def main(): Unit = {
    val server = Http.server
//      .configured(Stats(statsReceiver))
      .serve(
        s":$port",
        api
      )

    onExit {
      println(s"close graph-server for ${nsService.graph.iri}")
      server.close()
    }

    Await.ready(adminHttpServer)
  }
}
case class NSService(context: String, graph: Graph) extends JsonLDModule {
  val jsonld = JsonLD(graph)

  val headersAll = root.map(_.headerMap.toMap)
  val cache      = mutable.HashMap[String, mutable.HashMap[String, Json]]()

  /**
    * retrieve a single resource
    * @param uri
    * @return
    */
  val getUri: Endpoint[IO, Json] = get(paths[String]) { (paths: Seq[String]) =>
    val path = paths.mkString("/")
    cache
      .get(context + path)
      .flatMap(_.get("application/ld+json"))
      .orElse(
        graph.ns.nodes
          .hasIri(context + path)
          .headOption
          .map(jsonld.encode(_))
          .map { json =>
            cache += (context + path)                                                              -> (cache
              .getOrElse(context + path, mutable.HashMap[String, Json]()) += "application/ld+json" -> json)
            json
          })
      .map(Ok(_)) //.withHeader("Content-Type", "application/ld+json"))
      .getOrElse(finch.NotFound(new Exception("unknown path")))
  }

  val api = getUri

}
