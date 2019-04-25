package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReservationPackage
    extends OntologyDef(
      iri = "http://schema.org/ReservationPackage",
      iris = Set("http://schema.org/ReservationPackage"),
      label = "ReservationPackage",
      comment = """A group of multiple reservations with common values for all sub-reservations.""",
      `@extends` = () => List(Reservation.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Reservation.Properties {
    lazy val subReservation = lspace.ns.vocab.schema.subReservation.property
  }
  override lazy val properties: List[LProperty] = List(subReservation)
  trait Properties extends lspace.ns.vocab.schema.Reservation.Properties {
    lazy val subReservation = lspace.ns.vocab.schema.subReservation.property
  }
}
