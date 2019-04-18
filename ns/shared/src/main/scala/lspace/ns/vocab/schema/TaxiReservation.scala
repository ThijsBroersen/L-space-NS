package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TaxiReservation
    extends OntologyDef(
      iri = "http://schema.org/TaxiReservation",
      iris = Set("http://schema.org/TaxiReservation"),
      label = "TaxiReservation",
      comment =
        """A reservation for a taxi.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.""",
      `@extends` = () => List(Reservation.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Reservation.Properties {
    lazy val pickupTime     = lspace.ns.vocab.schema.pickupTime.property
    lazy val pickupLocation = lspace.ns.vocab.schema.pickupLocation.property
    lazy val partySize      = lspace.ns.vocab.schema.partySize.property
  }
  override lazy val properties: List[Property] = List(pickupTime, pickupLocation, partySize)
  trait Properties extends lspace.ns.vocab.schema.Reservation.Properties {
    lazy val pickupTime     = lspace.ns.vocab.schema.pickupTime.property
    lazy val pickupLocation = lspace.ns.vocab.schema.pickupLocation.property
    lazy val partySize      = lspace.ns.vocab.schema.partySize.property
  }
}
