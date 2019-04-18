package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object deliveryLeadTime
    extends PropertyDef(
      iri = "http://schema.org/deliveryLeadTime",
      iris = Set("http://schema.org/deliveryLeadTime"),
      label = "deliveryLeadTime",
      comment =
        """The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
