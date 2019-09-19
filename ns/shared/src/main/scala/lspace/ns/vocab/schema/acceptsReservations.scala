package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object acceptsReservations extends PropertyDef(
        iri = "http://schema.org/acceptsReservations",
        iris = Set("http://schema.org/acceptsReservations"),
        label = "acceptsReservations",
        comment = """Indicates whether a FoodEstablishment accepts reservations. Values can be Boolean, an URL at which reservations can be made or (for backwards compatibility) the strings <code>Yes</code> or <code>No</code>.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, `@boolean`, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}