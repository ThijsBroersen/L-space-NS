package lspace.meta.vocab

import lspace.Label
import monix.eval.Task

import scala.concurrent.Future
//import lspace.ns.vocab.schema.Person
import scala.meta._
import org.scalatest.{AsyncWordSpec, Matchers}

class schemaSpec extends AsyncWordSpec with Matchers {

  "schema" should {
    "get https://schema.org/.. from schema.org and create *Def-files accordingly" in {
      Task
        .sequence(Seq(
          schema
            .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/Person"),
          schema
            .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/Place"),
          schema
            .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/PostalAddress"),
          schema
            .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/CreativeWork"),
          schema
            .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/Event"),
          schema
            .genProperty("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/memberOf")
        ))
        .map(_.nonEmpty shouldBe true)
        .runToFuture(monix.execution.Scheduler.global)
    }
    "write @ids/sameAs" in {
      val label = "sameAs"
      val code  = schema.propertyToPropertyDef(Label.P.`@ids`, Some(label))
      schema.saveToFile(s"ns/shared/src/main/scala/lspace/ns/vocab/schema/${label}.scala", code.parse[Source].get)
      Future { 1 shouldBe 1 }
    }
  }
}
