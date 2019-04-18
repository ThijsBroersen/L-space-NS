package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object steeringPosition
    extends PropertyDef(
      iri = "http://schema.org/steeringPosition",
      iris = Set("http://schema.org/steeringPosition"),
      label = "steeringPosition",
      comment = """The position of the steering wheel or similar device (mostly for cars).""",
      `@extends` = () => List(),
      `@range` = () => List(SteeringPositionValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
