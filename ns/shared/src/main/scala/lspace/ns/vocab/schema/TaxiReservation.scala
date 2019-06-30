package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TaxiReservation extends OntologyDef(
        iri = "http://schema.org/TaxiReservation",
        iris = Set("http://schema.org/TaxiReservation"),
        label = "TaxiReservation",
        comment = """A reservation for a taxi.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.""",
        `@extends` = () => List(Reservation.ontology)
       ){
}