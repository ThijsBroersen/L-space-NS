package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object orderDelivery extends PropertyDef(
        iri = "http://schema.org/orderDelivery",
        iris = Set("http://schema.org/orderDelivery"),
        label = "orderDelivery",
        comment = """The delivery of the parcel related to this order or order item.""",
        `@extends` = () => List(),
        `@range` = () => List(ParcelDelivery.ontology)
       ){
}