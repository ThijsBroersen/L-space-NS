package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Order
    extends OntologyDef(
      iri = "http://schema.org/Order",
      iris = Set("http://schema.org/Order"),
      label = "Order",
      comment =
        """An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val paymentDueDate   = lspace.ns.vocab.schema.paymentDueDate.property
    lazy val orderedItem      = lspace.ns.vocab.schema.orderedItem.property
    lazy val discount         = lspace.ns.vocab.schema.discount.property
    lazy val discountCurrency = lspace.ns.vocab.schema.discountCurrency.property
    lazy val broker           = lspace.ns.vocab.schema.broker.property
    lazy val discountCode     = lspace.ns.vocab.schema.discountCode.property
    lazy val isGift           = lspace.ns.vocab.schema.isGift.property
    lazy val seller           = lspace.ns.vocab.schema.seller.property
    lazy val paymentMethod    = lspace.ns.vocab.schema.paymentMethod.property
    lazy val acceptedOffer    = lspace.ns.vocab.schema.acceptedOffer.property
    lazy val paymentMethodId  = lspace.ns.vocab.schema.paymentMethodId.property
    lazy val orderDelivery    = lspace.ns.vocab.schema.orderDelivery.property
    lazy val merchant         = lspace.ns.vocab.schema.merchant.property
  }
  override lazy val properties: List[Property] = List(
    paymentDueDate,
    orderedItem,
    discount,
    discountCurrency,
    broker,
    discountCode,
    isGift,
    seller,
    paymentMethod,
    acceptedOffer,
    paymentMethodId,
    orderDelivery,
    merchant
  )
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val paymentDueDate   = lspace.ns.vocab.schema.paymentDueDate.property
    lazy val orderedItem      = lspace.ns.vocab.schema.orderedItem.property
    lazy val discount         = lspace.ns.vocab.schema.discount.property
    lazy val discountCurrency = lspace.ns.vocab.schema.discountCurrency.property
    lazy val broker           = lspace.ns.vocab.schema.broker.property
    lazy val discountCode     = lspace.ns.vocab.schema.discountCode.property
    lazy val isGift           = lspace.ns.vocab.schema.isGift.property
    lazy val seller           = lspace.ns.vocab.schema.seller.property
    lazy val paymentMethod    = lspace.ns.vocab.schema.paymentMethod.property
    lazy val acceptedOffer    = lspace.ns.vocab.schema.acceptedOffer.property
    lazy val paymentMethodId  = lspace.ns.vocab.schema.paymentMethodId.property
    lazy val orderDelivery    = lspace.ns.vocab.schema.orderDelivery.property
    lazy val merchant         = lspace.ns.vocab.schema.merchant.property
  }
}
