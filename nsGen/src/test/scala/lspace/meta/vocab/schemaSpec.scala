package lspace.meta.vocab

import lspace.Label

import scala.concurrent.Future
//import lspace.ns.vocab.schema.Person
import scala.meta._
import org.scalatest.{AsyncWordSpec, Matchers}

class schemaSpec extends AsyncWordSpec with Matchers {

  "schema" should {
    "get https://schema.org/Person from schema.org and create *Def-files accordingly" in {
      schema
        .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/Person")
        .map(_ shouldBe true)
    }
    "get https://schema.org/Place from schema.org and create *Def-files accordingly" in {
      schema
        .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/Place")
        .map(_ shouldBe true)
    }
    "get https://schema.org/PostalAddress from schema.org and create *Def-files accordingly" in {
      schema
        .genOntology("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/PostalAddress")
        .map(_ shouldBe true)
    }
    "get properties from schema.org and create *Def-files accordingly" in {
      schema
        .genProperty("ns/shared/src/main/scala/lspace/ns/vocab/schema/", "https://schema.org/memberOf")
        .map(_ shouldBe true)
    }
    "write @ids/sameAs" in {
      val label = "sameAs"
      val code  = schema.propertyToPropertyDef(Label.P.`@ids`, Some(label))
      schema.saveToFile(s"ns/shared/src/main/scala/lspace/ns/vocab/schema/${label}.scala", code.parse[Source].get)
      Future { 1 shouldBe 1 }
    }
  }
}
