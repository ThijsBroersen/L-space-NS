package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object termsOfService
    extends PropertyDef(
      iri = "http://schema.org/termsOfService",
      iris = Set("http://schema.org/termsOfService"),
      label = "termsOfService",
      comment = """Human-readable terms of service documentation.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
