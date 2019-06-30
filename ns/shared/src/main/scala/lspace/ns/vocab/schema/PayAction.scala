package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PayAction extends OntologyDef(
        iri = "http://schema.org/PayAction",
        iris = Set("http://schema.org/PayAction"),
        label = "PayAction",
        comment = """An agent pays a price to a participant.""",
        `@extends` = () => List(TradeAction.ontology)
       ){
}