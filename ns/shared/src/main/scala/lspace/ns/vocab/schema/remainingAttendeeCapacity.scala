package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object remainingAttendeeCapacity extends PropertyDef(
        iri = "https://schema.org/remainingAttendeeCapacity",
        iris = Set("https://schema.org/remainingAttendeeCapacity"),
        label = "remainingAttendeeCapacity",
        comment = """The number of attendee places for an event that remain unallocated.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}