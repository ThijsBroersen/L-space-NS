package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object orderItemStatus extends PropertyDef(
        iri = "http://schema.org/orderItemStatus",
        iris = Set("http://schema.org/orderItemStatus"),
        label = "orderItemStatus",
        comment = """The current status of the order item.""",
        `@extends` = () => List(),
        `@range` = () => List(OrderStatus.ontology)
       ){
}