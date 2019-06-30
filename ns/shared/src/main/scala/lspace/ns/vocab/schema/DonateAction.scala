package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DonateAction extends OntologyDef(
        iri = "http://schema.org/DonateAction",
        iris = Set("http://schema.org/DonateAction"),
        label = "DonateAction",
        comment = """The act of providing goods, services, or money without compensation, often for philanthropic reasons.""",
        `@extends` = () => List(TradeAction.ontology)
       ){
}