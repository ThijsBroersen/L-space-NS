package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object arrivalAirport extends PropertyDef(
        iri = "http://schema.org/arrivalAirport",
        iris = Set("http://schema.org/arrivalAirport"),
        label = "arrivalAirport",
        comment = """The airport where the flight terminates.""",
        `@extends` = List(),
        `@range` = List(Airport.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}