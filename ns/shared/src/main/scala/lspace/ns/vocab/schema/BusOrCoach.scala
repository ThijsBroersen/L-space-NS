package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusOrCoach extends OntologyDef(
        iri = "http://schema.org/BusOrCoach",
        iris = Set("http://schema.org/BusOrCoach"),
        label = "BusOrCoach",
        comment = """A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel.""",
        `@extends` = () => List(Vehicle.ontology)
       ){
}