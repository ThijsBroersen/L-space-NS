package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Order extends OntologyDef(
        iri = "http://schema.org/Order",
        iris = Set("http://schema.org/Order"),
        label = "Order",
        comment = """An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val acceptedOffer = lspace.ns.vocab.schema.acceptedOffer.property
lazy val billingAddress = lspace.ns.vocab.schema.billingAddress.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val confirmationNumber = lspace.ns.vocab.schema.confirmationNumber.property
lazy val customer = lspace.ns.vocab.schema.customer.property
lazy val discount = lspace.ns.vocab.schema.discount.property
lazy val discountCode = lspace.ns.vocab.schema.discountCode.property
lazy val discountCurrency = lspace.ns.vocab.schema.discountCurrency.property
lazy val isGift = lspace.ns.vocab.schema.isGift.property
lazy val orderDate = lspace.ns.vocab.schema.orderDate.property
lazy val orderDelivery = lspace.ns.vocab.schema.orderDelivery.property
lazy val orderNumber = lspace.ns.vocab.schema.orderNumber.property
lazy val orderStatus = lspace.ns.vocab.schema.orderStatus.property
lazy val orderedItem = lspace.ns.vocab.schema.orderedItem.property
lazy val partOfInvoice = lspace.ns.vocab.schema.partOfInvoice.property
lazy val paymentDueDate = lspace.ns.vocab.schema.paymentDueDate.property
lazy val paymentMethod = lspace.ns.vocab.schema.paymentMethod.property
lazy val paymentMethodId = lspace.ns.vocab.schema.paymentMethodId.property
lazy val paymentUrl = lspace.ns.vocab.schema.paymentUrl.property
lazy val seller = lspace.ns.vocab.schema.seller.property
}
override lazy val properties: List[LProperty] = List(acceptedOffer, billingAddress, broker, confirmationNumber, customer, discount, discountCode, discountCurrency, isGift, orderDate, orderDelivery, orderNumber, orderStatus, orderedItem, partOfInvoice, paymentDueDate, paymentMethod, paymentMethodId, paymentUrl, seller)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val acceptedOffer = lspace.ns.vocab.schema.acceptedOffer.property
lazy val billingAddress = lspace.ns.vocab.schema.billingAddress.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val confirmationNumber = lspace.ns.vocab.schema.confirmationNumber.property
lazy val customer = lspace.ns.vocab.schema.customer.property
lazy val discount = lspace.ns.vocab.schema.discount.property
lazy val discountCode = lspace.ns.vocab.schema.discountCode.property
lazy val discountCurrency = lspace.ns.vocab.schema.discountCurrency.property
lazy val isGift = lspace.ns.vocab.schema.isGift.property
lazy val orderDate = lspace.ns.vocab.schema.orderDate.property
lazy val orderDelivery = lspace.ns.vocab.schema.orderDelivery.property
lazy val orderNumber = lspace.ns.vocab.schema.orderNumber.property
lazy val orderStatus = lspace.ns.vocab.schema.orderStatus.property
lazy val orderedItem = lspace.ns.vocab.schema.orderedItem.property
lazy val partOfInvoice = lspace.ns.vocab.schema.partOfInvoice.property
lazy val paymentDueDate = lspace.ns.vocab.schema.paymentDueDate.property
lazy val paymentMethod = lspace.ns.vocab.schema.paymentMethod.property
lazy val paymentMethodId = lspace.ns.vocab.schema.paymentMethodId.property
lazy val paymentUrl = lspace.ns.vocab.schema.paymentUrl.property
lazy val seller = lspace.ns.vocab.schema.seller.property
}
}