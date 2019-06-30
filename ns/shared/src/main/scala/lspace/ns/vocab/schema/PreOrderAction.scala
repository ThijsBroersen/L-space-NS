package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PreOrderAction extends OntologyDef(
        iri = "http://schema.org/PreOrderAction",
        iris = Set("http://schema.org/PreOrderAction"),
        label = "PreOrderAction",
        comment = """An agent orders a (not yet released) object/product/service to be delivered/sent.""",
        `@extends` = () => List(TradeAction.ontology)
       ){
}