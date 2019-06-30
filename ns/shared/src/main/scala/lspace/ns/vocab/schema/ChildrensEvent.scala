package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ChildrensEvent extends OntologyDef(
        iri = "http://schema.org/ChildrensEvent",
        iris = Set("http://schema.org/ChildrensEvent"),
        label = "ChildrensEvent",
        comment = """Event type: Children's event.""",
        `@extends` = () => List(Event.ontology)
       ){
}