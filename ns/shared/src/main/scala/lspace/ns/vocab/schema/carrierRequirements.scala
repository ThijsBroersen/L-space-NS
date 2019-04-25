package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object carrierRequirements
    extends PropertyDef(
      iri = "http://schema.org/carrierRequirements",
      iris = Set("http://schema.org/carrierRequirements"),
      label = "carrierRequirements",
      comment =
        """Specifies specific carrier(s) requirements for the application (e.g. an application may only work on a specific carrier network).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
