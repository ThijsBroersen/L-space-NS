package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AggregateRating
    extends OntologyDef(
      iri = "http://schema.org/AggregateRating",
      iris = Set("http://schema.org/AggregateRating"),
      label = "AggregateRating",
      comment = """The average rating based on multiple ratings or reviews.""",
      `@extends` = () => List(Rating.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Rating.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Rating.Properties {}
}
