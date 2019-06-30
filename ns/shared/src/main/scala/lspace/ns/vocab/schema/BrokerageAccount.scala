package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BrokerageAccount extends OntologyDef(
        iri = "http://schema.org/BrokerageAccount",
        iris = Set("http://schema.org/BrokerageAccount"),
        label = "BrokerageAccount",
        comment = """An account that allows an investor to deposit funds and place investment orders with a licensed broker or brokerage firm.""",
        `@extends` = () => List(InvestmentOrDeposit.ontology)
       ){
}