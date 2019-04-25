package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object serviceUrl
    extends PropertyDef(
      iri = "http://schema.org/serviceUrl",
      iris = Set("http://schema.org/serviceUrl"),
      label = "serviceUrl",
      comment = """The website to access the service.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
