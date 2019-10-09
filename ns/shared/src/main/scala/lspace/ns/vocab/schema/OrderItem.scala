package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OrderItem extends OntologyDef(
        iri = "http://schema.org/OrderItem",
        iris = Set("http://schema.org/OrderItem"),
        label = "OrderItem",
        comment = """An order item is a line of an order. It includes the quantity and shipping details of a bought offer.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val orderDelivery = lspace.ns.vocab.schema.orderDelivery.property
lazy val orderItemNumber = lspace.ns.vocab.schema.orderItemNumber.property
lazy val orderItemStatus = lspace.ns.vocab.schema.orderItemStatus.property
lazy val orderQuantity = lspace.ns.vocab.schema.orderQuantity.property
lazy val orderedItem = lspace.ns.vocab.schema.orderedItem.property
}
override lazy val properties: List[LProperty] = List(orderDelivery, orderItemNumber, orderItemStatus, orderQuantity, orderedItem)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val orderDelivery = lspace.ns.vocab.schema.orderDelivery.property
lazy val orderItemNumber = lspace.ns.vocab.schema.orderItemNumber.property
lazy val orderItemStatus = lspace.ns.vocab.schema.orderItemStatus.property
lazy val orderQuantity = lspace.ns.vocab.schema.orderQuantity.property
lazy val orderedItem = lspace.ns.vocab.schema.orderedItem.property
}
}