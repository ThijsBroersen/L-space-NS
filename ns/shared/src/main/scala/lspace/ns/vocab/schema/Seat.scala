package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Seat extends OntologyDef(
        iri = "http://schema.org/Seat",
        iris = Set("http://schema.org/Seat"),
        label = "Seat",
        comment = """Used to describe a seat, such as a reserved seat in an event reservation.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}