package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TrainTrip extends OntologyDef(
        iri = "http://schema.org/TrainTrip",
        iris = Set("http://schema.org/TrainTrip"),
        label = "TrainTrip",
        comment = """A trip on a commercial train line.""",
        `@extends` = () => List(Trip.ontology)
       ){
}