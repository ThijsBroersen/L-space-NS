package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BuyAction extends OntologyDef(
        iri = "http://schema.org/BuyAction",
        iris = Set("http://schema.org/BuyAction"),
        label = "BuyAction",
        comment = """The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.""",
        `@extends` = () => List(TradeAction.ontology)
       ){
}