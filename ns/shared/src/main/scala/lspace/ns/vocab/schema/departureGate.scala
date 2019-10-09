package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object departureGate extends PropertyDef(
        iri = "http://schema.org/departureGate",
        iris = Set("http://schema.org/departureGate"),
        label = "departureGate",
        comment = """Identifier of the flight's departure gate.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}