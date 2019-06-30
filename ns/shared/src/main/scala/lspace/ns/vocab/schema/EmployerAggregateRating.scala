package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EmployerAggregateRating extends OntologyDef(
        iri = "http://schema.org/EmployerAggregateRating",
        iris = Set("http://schema.org/EmployerAggregateRating"),
        label = "EmployerAggregateRating",
        comment = """An aggregate rating of an Organization related to its role as an employer.""",
        `@extends` = () => List(AggregateRating.ontology)
       ){
}