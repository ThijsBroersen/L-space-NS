package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MotorizedBicycle
    extends OntologyDef(
      iri = "http://schema.org/MotorizedBicycle",
      iris = Set("http://schema.org/MotorizedBicycle"),
      label = "MotorizedBicycle",
      comment =
        """A motorized bicycle is a bicycle with an attached motor used to power the vehicle, or to assist with pedaling.""",
      `@extends` = () => List(Vehicle.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Vehicle.Properties {

    override lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
    override lazy val purchaseDate   = lspace.ns.vocab.schema.purchaseDate.property
  }
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Vehicle.Properties {

    override lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
    override lazy val purchaseDate   = lspace.ns.vocab.schema.purchaseDate.property
  }
}
