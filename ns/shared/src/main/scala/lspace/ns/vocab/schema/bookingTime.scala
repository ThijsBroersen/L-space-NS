package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bookingTime extends PropertyDef(
        iri = "http://schema.org/bookingTime",
        iris = Set("http://schema.org/bookingTime"),
        label = "bookingTime",
        comment = """The date and time the reservation was booked.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}