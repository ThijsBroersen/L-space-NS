package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object remainingAttendeeCapacity extends PropertyDef(
        iri = "http://schema.org/remainingAttendeeCapacity",
        iris = Set("http://schema.org/remainingAttendeeCapacity"),
        label = "remainingAttendeeCapacity",
        comment = """The number of attendee places for an event that remain unallocated.""",
        `@extends` = () => List(),
        `@range` = () => List(Integer.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}