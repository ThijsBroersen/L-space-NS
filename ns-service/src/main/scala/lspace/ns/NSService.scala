package lspace.ns

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
import lspace.codec.{ActiveContext, JsonObjectInProgress}
import lspace.datatype.DataType
import lspace.P
import lspace.librarian.traversal.Step
import lspace.provider.mem.MemGraph
import lspace.structure._
import lspace.ns._
import lspace.services.rest.endpoints.Api
import monix.eval.Task
import shapeless.{:+:, CNil}

import scala.collection.mutable
import scala.concurrent
import scala.concurrent.duration._

object NSService extends TwitterServer {

  lazy val graph: Graph = MemGraph("https://ns.l-space.eu/")
  val context           = graph.iri
  lazy val nsService    = NSService(context, graph)

  import monix.execution.Scheduler.Implicits.global

  concurrent.Await.ready(
    Task
      .gatherUnordered(
        P.predicates.map(_.ontology).map(graph.ns.ontologies.store) ++
          Step.steps.map(_.ontology).map(graph.ns.ontologies.store) ++
          List(graph.ns.ontologies.store(File.ontology),
               graph.ns.ontologies.store(Directory.ontology),
               graph.ns.ontologies.store(User.ontology)) ++
          File.properties.map(graph.ns.properties.store) ++
          Directory.properties.map(graph.ns.properties.store) ++
          User.properties.map(graph.ns.properties.store))
      .runToFuture,
    5 seconds
  )

  lazy val port: Int = 8080

  import lspace.services.codecs.Application
  import lspace.services.codecs.Encode._
  import lspace.encode.EncodeJsonLD._
  implicit val activeContext: ActiveContext = ActiveContext()

  lazy val api: Service[Request, Response] = Bootstrap
    .configure(enableMethodNotAllowed = true, enableUnsupportedMediaType = true)
    .serve[Application.JsonLD :+: CNil](nsService.api)
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
case class NSService(context: String, graph: Graph) extends Api {
  implicit val nencoder: lspace.codec.NativeTypeEncoder.Aux[argonaut.Json] = lspace.codec.argonaut.NativeTypeEncoder
  implicit val encoder                                                     = lspace.codec.jsonld.Encoder(nencoder)
  implicit val ndecoder                                                    = lspace.codec.argonaut.NativeTypeDecoder
  implicit val decoder                                                     = lspace.codec.jsonld.Decoder(graph)(ndecoder)

  val headersAll = root.map(_.headerMap.toMap)
  val cache      = mutable.HashMap[String, mutable.HashMap[String, String]]()

  import encoder._

  /**
    * retrieve a single resource
    * @return
    */
  val getUri: Endpoint[IO, String] = get(paths[String]) { (paths: Seq[String]) =>
    val path = paths.mkString("/")
    cache
      .get(context + path)
      .flatMap(_.get("application/ld+json"))
      .orElse(
        graph.ns.classtypes
          .cached(context + path)
          .map {
            case ontology: Ontology    => encoder.fromOntology(ontology)(ActiveContext())
            case property: Property    => encoder.fromProperty(property)(ActiveContext())
            case datatype: DataType[_] => encoder.fromDataType(datatype)(ActiveContext())
          }
          .map(_.withContext.asInstanceOf[encoder.Json].noSpaces)
          .map { json =>
            cache += (context + path)                                                                -> (cache
              .getOrElse(context + path, mutable.HashMap[String, String]()) += "application/ld+json" -> json)
            json
          })
      .map(Ok(_)) //.withHeader("Content-Type", "application/ld+json"))
      .getOrElse(finch.NotFound(new Exception("unknown path")))
  }

  val api = getUri

}
