package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object vehicleSeatingCapacity
    extends PropertyDef(
      iri = "http://schema.org/vehicleSeatingCapacity",
      iris = Set("http://schema.org/vehicleSeatingCapacity"),
      label = "vehicleSeatingCapacity",
      comment =
        """The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br/><br/>

Typical unit code(s): C62 for persons.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology, Number.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
