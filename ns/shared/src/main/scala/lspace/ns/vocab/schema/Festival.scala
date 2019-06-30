package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Festival extends OntologyDef(
        iri = "http://schema.org/Festival",
        iris = Set("http://schema.org/Festival"),
        label = "Festival",
        comment = """Event type: Festival.""",
        `@extends` = () => List(Event.ontology)
       ){
}