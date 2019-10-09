package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfBeds extends PropertyDef(
        iri = "http://schema.org/numberOfBeds",
        iris = Set("http://schema.org/numberOfBeds"),
        label = "numberOfBeds",
        comment = """The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}