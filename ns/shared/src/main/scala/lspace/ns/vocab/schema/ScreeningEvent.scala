package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ScreeningEvent extends OntologyDef(
        iri = "http://schema.org/ScreeningEvent",
        iris = Set("http://schema.org/ScreeningEvent"),
        label = "ScreeningEvent",
        comment = """A screening of a movie or other video.""",
        `@extends` = () => List(Event.ontology)
       ){
}