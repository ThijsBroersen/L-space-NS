package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusinessEvent extends OntologyDef(
        iri = "http://schema.org/BusinessEvent",
        iris = Set("http://schema.org/BusinessEvent"),
        label = "BusinessEvent",
        comment = """Event type: Business event.""",
        `@extends` = () => List(Event.ontology)
       ){
}