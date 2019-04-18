package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object vehicleConfiguration
    extends PropertyDef(
      iri = "http://schema.org/vehicleConfiguration",
      iris = Set("http://schema.org/vehicleConfiguration"),
      label = "vehicleConfiguration",
      comment =
        """A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
