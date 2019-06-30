package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TheaterEvent extends OntologyDef(
        iri = "http://schema.org/TheaterEvent",
        iris = Set("http://schema.org/TheaterEvent"),
        label = "TheaterEvent",
        comment = """Event type: Theater performance.""",
        `@extends` = () => List(Event.ontology)
       ){
}