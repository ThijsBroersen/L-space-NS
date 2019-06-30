package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OrderAction extends OntologyDef(
        iri = "http://schema.org/OrderAction",
        iris = Set("http://schema.org/OrderAction"),
        label = "OrderAction",
        comment = """An agent orders an object/product/service to be delivered/sent.""",
        `@extends` = () => List(TradeAction.ontology)
       ){
}