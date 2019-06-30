package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportsEvent extends OntologyDef(
        iri = "http://schema.org/SportsEvent",
        iris = Set("http://schema.org/SportsEvent"),
        label = "SportsEvent",
        comment = """Event type: Sports event.""",
        `@extends` = () => List(Event.ontology)
       ){
}