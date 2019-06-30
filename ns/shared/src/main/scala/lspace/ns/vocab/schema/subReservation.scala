package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subReservation extends PropertyDef(
        iri = "http://schema.org/subReservation",
        iris = Set("http://schema.org/subReservation"),
        label = "subReservation",
        comment = """The individual reservations included in the package. Typically a repeated property.""",
        `@extends` = () => List(),
        `@range` = () => List(Reservation.ontology)
       ){
}