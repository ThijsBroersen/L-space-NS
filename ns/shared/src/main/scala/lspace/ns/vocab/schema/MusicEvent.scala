package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicEvent extends OntologyDef(
        iri = "http://schema.org/MusicEvent",
        iris = Set("http://schema.org/MusicEvent"),
        label = "MusicEvent",
        comment = """Event type: Music event.""",
        `@extends` = () => List(Event.ontology)
       ){
}