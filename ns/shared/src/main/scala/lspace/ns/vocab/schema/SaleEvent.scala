package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SaleEvent extends OntologyDef(
        iri = "http://schema.org/SaleEvent",
        iris = Set("http://schema.org/SaleEvent"),
        label = "SaleEvent",
        comment = """Event type: Sales event.""",
        `@extends` = () => List(Event.ontology)
       ){
}