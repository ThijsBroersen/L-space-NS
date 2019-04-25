package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object fuelCapacity
    extends PropertyDef(
      iri = "http://schema.org/fuelCapacity",
      iris = Set("http://schema.org/fuelCapacity"),
      label = "fuelCapacity",
      comment =
        """The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.<br/><br/>

Typical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
