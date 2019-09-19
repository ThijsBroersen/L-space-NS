package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FlightReservation extends OntologyDef(
        iri = "http://schema.org/FlightReservation",
        iris = Set("http://schema.org/FlightReservation"),
        label = "FlightReservation",
        comment = """A reservation for air travel.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.""",
        `@extends` = () => List(Reservation.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val boardingGroup = lspace.ns.vocab.schema.boardingGroup.property
lazy val passengerPriorityStatus = lspace.ns.vocab.schema.passengerPriorityStatus.property
lazy val passengerSequenceNumber = lspace.ns.vocab.schema.passengerSequenceNumber.property
lazy val securityScreening = lspace.ns.vocab.schema.securityScreening.property
}
override lazy val properties: List[LProperty] = List(boardingGroup, passengerPriorityStatus, passengerSequenceNumber, securityScreening)
trait Properties extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val boardingGroup = lspace.ns.vocab.schema.boardingGroup.property
lazy val passengerPriorityStatus = lspace.ns.vocab.schema.passengerPriorityStatus.property
lazy val passengerSequenceNumber = lspace.ns.vocab.schema.passengerSequenceNumber.property
lazy val securityScreening = lspace.ns.vocab.schema.securityScreening.property
}
}