package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VisualArtsEvent extends OntologyDef(
        iri = "http://schema.org/VisualArtsEvent",
        iris = Set("http://schema.org/VisualArtsEvent"),
        label = "VisualArtsEvent",
        comment = """Event type: Visual arts event.""",
        `@extends` = () => List(Event.ontology)
       ){
}