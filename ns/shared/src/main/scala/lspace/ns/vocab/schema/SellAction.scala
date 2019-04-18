package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SellAction extends OntologyDef(
        iri = "http://schema.org/SellAction",
        iris = Set("http://schema.org/SellAction"),
        label = "SellAction",
        comment = """The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.""",
        `@extends` = () => List(TradeAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.TradeAction.Properties{
lazy val warrantyPromise = lspace.ns.vocab.schema.warrantyPromise.property
}
override lazy val properties: List[LProperty] = List(warrantyPromise)
trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties{
lazy val warrantyPromise = lspace.ns.vocab.schema.warrantyPromise.property
}
}