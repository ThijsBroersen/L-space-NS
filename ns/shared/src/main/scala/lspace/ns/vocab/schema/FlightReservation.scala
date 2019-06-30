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
}