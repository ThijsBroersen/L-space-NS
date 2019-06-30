package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LodgingReservation extends OntologyDef(
        iri = "http://schema.org/LodgingReservation",
        iris = Set("http://schema.org/LodgingReservation"),
        label = "LodgingReservation",
        comment = """A reservation for lodging at a hotel, motel, inn, etc.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.""",
        `@extends` = () => List(Reservation.ontology)
       ){
}