package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object serviceAudience
    extends PropertyDef(
      iri = "http://schema.org/serviceAudience",
      iris = Set("http://schema.org/serviceAudience"),
      label = "serviceAudience",
      comment = """The audience eligible for this service.""",
      `@extends` = () => List(),
      `@range` = () => List(Audience.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
