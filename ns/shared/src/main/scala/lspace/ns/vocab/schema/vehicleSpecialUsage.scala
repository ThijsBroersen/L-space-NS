package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object vehicleSpecialUsage
    extends PropertyDef(
      iri = "http://schema.org/vehicleSpecialUsage",
      iris = Set("http://schema.org/vehicleSpecialUsage"),
      label = "vehicleSpecialUsage",
      comment =
        """Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, CarUsageType.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
