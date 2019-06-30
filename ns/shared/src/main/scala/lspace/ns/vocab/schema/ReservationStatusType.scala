package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReservationStatusType extends OntologyDef(
        iri = "http://schema.org/ReservationStatusType",
        iris = Set("http://schema.org/ReservationStatusType"),
        label = "ReservationStatusType",
        comment = """Enumerated status values for Reservation.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}