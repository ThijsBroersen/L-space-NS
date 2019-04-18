package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object reservationStatus
    extends PropertyDef(
      iri = "http://schema.org/reservationStatus",
      iris = Set("http://schema.org/reservationStatus"),
      label = "reservationStatus",
      comment = """The current status of the reservation.""",
      `@extends` = () => List(),
      `@range` = () => List(ReservationStatusType.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
