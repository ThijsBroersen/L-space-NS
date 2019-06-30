package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Airline extends OntologyDef(
        iri = "http://schema.org/Airline",
        iris = Set("http://schema.org/Airline"),
        label = "Airline",
        comment = """An organization that provides flights for passengers.""",
        `@extends` = () => List(Organization.ontology)
       ){
}