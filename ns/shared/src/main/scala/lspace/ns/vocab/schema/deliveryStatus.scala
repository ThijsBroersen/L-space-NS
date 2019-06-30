package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object deliveryStatus extends PropertyDef(
        iri = "http://schema.org/deliveryStatus",
        iris = Set("http://schema.org/deliveryStatus"),
        label = "deliveryStatus",
        comment = """New entry added as the package passes through each leg of its journey (from shipment to final delivery).""",
        `@extends` = () => List(),
        `@range` = () => List(DeliveryEvent.ontology)
       ){
}