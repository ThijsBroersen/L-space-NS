package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object aggregateRating
    extends PropertyDef(
      iri = "http://schema.org/aggregateRating",
      iris = Set("http://schema.org/aggregateRating"),
      label = "aggregateRating",
      comment = """The overall rating, based on a collection of reviews or ratings, of the item.""",
      `@extends` = () => List(),
      `@range` = () => List(AggregateRating.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
