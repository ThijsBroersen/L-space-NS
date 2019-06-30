package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Trip extends OntologyDef(
        iri = "http://schema.org/Trip",
        iris = Set("http://schema.org/Trip"),
        label = "Trip",
        comment = """A trip or journey. An itinerary of visits to one or more places.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}