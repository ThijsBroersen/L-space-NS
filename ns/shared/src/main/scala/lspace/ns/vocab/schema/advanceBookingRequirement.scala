package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object advanceBookingRequirement
    extends PropertyDef(
      iri = "http://schema.org/advanceBookingRequirement",
      iris = Set("http://schema.org/advanceBookingRequirement"),
      label = "advanceBookingRequirement",
      comment =
        """The amount of time that is required between accepting the offer and the actual usage of the resource or service.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
