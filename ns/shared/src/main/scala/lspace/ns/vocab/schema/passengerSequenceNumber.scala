package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object passengerSequenceNumber
    extends PropertyDef(
      iri = "http://schema.org/passengerSequenceNumber",
      iris = Set("http://schema.org/passengerSequenceNumber"),
      label = "passengerSequenceNumber",
      comment = """The passenger's sequence number as assigned by the airline.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
