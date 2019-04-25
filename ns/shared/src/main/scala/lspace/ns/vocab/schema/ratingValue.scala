package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ratingValue
    extends PropertyDef(
      iri = "http://schema.org/ratingValue",
      iris = Set("http://schema.org/ratingValue"),
      label = "ratingValue",
      comment = """The rating for the content.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
