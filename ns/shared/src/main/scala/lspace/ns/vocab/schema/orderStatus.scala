package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object orderStatus extends PropertyDef(
        iri = "http://schema.org/orderStatus",
        iris = Set("http://schema.org/orderStatus"),
        label = "orderStatus",
        comment = """The current status of the order.""",
        `@extends` = () => List(),
        `@range` = () => List(OrderStatus.ontology)
       ){
}