package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BuyAction
    extends OntologyDef(
      iri = "http://schema.org/BuyAction",
      iris = Set("http://schema.org/BuyAction"),
      label = "BuyAction",
      comment =
        """The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.""",
      `@extends` = () => List(TradeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TradeAction.Properties {
    lazy val vendor          = lspace.ns.vocab.schema.vendor.property
    lazy val warrantyPromise = lspace.ns.vocab.schema.warrantyPromise.property
    lazy val seller          = lspace.ns.vocab.schema.seller.property
  }
  override lazy val properties: List[Property] = List(vendor, warrantyPromise, seller)
  trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties {
    lazy val vendor          = lspace.ns.vocab.schema.vendor.property
    lazy val warrantyPromise = lspace.ns.vocab.schema.warrantyPromise.property
    lazy val seller          = lspace.ns.vocab.schema.seller.property
  }
}
