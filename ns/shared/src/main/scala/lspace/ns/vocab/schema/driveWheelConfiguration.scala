package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object driveWheelConfiguration
    extends PropertyDef(
      iri = "http://schema.org/driveWheelConfiguration",
      iris = Set("http://schema.org/driveWheelConfiguration"),
      label = "driveWheelConfiguration",
      comment =
        """The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology, DriveWheelConfigurationValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
