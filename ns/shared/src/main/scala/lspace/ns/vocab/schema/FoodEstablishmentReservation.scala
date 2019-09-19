package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FoodEstablishmentReservation extends OntologyDef(
        iri = "http://schema.org/FoodEstablishmentReservation",
        iris = Set("http://schema.org/FoodEstablishmentReservation"),
        label = "FoodEstablishmentReservation",
        comment = """A reservation to dine at a food-related business.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.""",
        `@extends` = () => List(Reservation.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val endTime = lspace.ns.vocab.schema.endTime.property
lazy val partySize = lspace.ns.vocab.schema.partySize.property
lazy val startTime = lspace.ns.vocab.schema.startTime.property
}
override lazy val properties: List[LProperty] = List(endTime, partySize, startTime)
trait Properties extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val endTime = lspace.ns.vocab.schema.endTime.property
lazy val partySize = lspace.ns.vocab.schema.partySize.property
lazy val startTime = lspace.ns.vocab.schema.startTime.property
}
}