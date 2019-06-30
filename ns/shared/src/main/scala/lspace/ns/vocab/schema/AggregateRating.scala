package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AggregateRating extends OntologyDef(
        iri = "http://schema.org/AggregateRating",
        iris = Set("http://schema.org/AggregateRating"),
        label = "AggregateRating",
        comment = """The average rating based on multiple ratings or reviews.""",
        `@extends` = () => List(Rating.ontology)
       ){
}