package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bestRating
    extends PropertyDef(
      iri = "http://schema.org/bestRating",
      iris = Set("http://schema.org/bestRating"),
      label = "bestRating",
      comment = """The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
