package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RentalCarReservation extends OntologyDef(
        iri = "http://schema.org/RentalCarReservation",
        iris = Set("http://schema.org/RentalCarReservation"),
        label = "RentalCarReservation",
        comment = """A reservation for a rental car.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.""",
        `@extends` = () => List(Reservation.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val dropoffLocation = lspace.ns.vocab.schema.dropoffLocation.property
lazy val dropoffTime = lspace.ns.vocab.schema.dropoffTime.property
lazy val pickupLocation = lspace.ns.vocab.schema.pickupLocation.property
lazy val pickupTime = lspace.ns.vocab.schema.pickupTime.property
}
override lazy val properties: List[LProperty] = List(dropoffLocation, dropoffTime, pickupLocation, pickupTime)
trait Properties extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val dropoffLocation = lspace.ns.vocab.schema.dropoffLocation.property
lazy val dropoffTime = lspace.ns.vocab.schema.dropoffTime.property
lazy val pickupLocation = lspace.ns.vocab.schema.pickupLocation.property
lazy val pickupTime = lspace.ns.vocab.schema.pickupTime.property
}
}