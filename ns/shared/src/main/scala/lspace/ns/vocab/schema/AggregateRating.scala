package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AggregateRating extends OntologyDef(
        iri = "http://schema.org/AggregateRating",
        iris = Set("http://schema.org/AggregateRating"),
        label = "AggregateRating",
        comment = """The average rating based on multiple ratings or reviews.""",
        `@extends` = List(Rating.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Rating.Properties{
lazy val itemReviewed = lspace.ns.vocab.schema.itemReviewed.property
lazy val ratingCount = lspace.ns.vocab.schema.ratingCount.property
lazy val reviewCount = lspace.ns.vocab.schema.reviewCount.property
}
override lazy val properties: List[LProperty] = List(itemReviewed, ratingCount, reviewCount)
trait Properties extends lspace.ns.vocab.schema.Rating.Properties{
lazy val itemReviewed = lspace.ns.vocab.schema.itemReviewed.property
lazy val ratingCount = lspace.ns.vocab.schema.ratingCount.property
lazy val reviewCount = lspace.ns.vocab.schema.reviewCount.property
}
}