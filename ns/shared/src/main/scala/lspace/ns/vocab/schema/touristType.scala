package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object touristType
    extends PropertyDef(
      iri = "http://schema.org/touristType",
      iris = Set("http://schema.org/touristType"),
      label = "touristType",
      comment = """Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, Audience.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
