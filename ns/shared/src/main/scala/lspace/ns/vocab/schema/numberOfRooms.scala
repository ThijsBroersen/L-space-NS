package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object numberOfRooms
    extends PropertyDef(
      iri = "http://schema.org/numberOfRooms",
      iris = Set("http://schema.org/numberOfRooms"),
      label = "numberOfRooms",
      comment =
        """The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
