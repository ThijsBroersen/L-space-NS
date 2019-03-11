package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object maximumAttendeeCapacity extends PropertyDef(
        iri = "https://schema.org/maximumAttendeeCapacity",
        iris = Set("https://schema.org/maximumAttendeeCapacity"),
        label = "maximumAttendeeCapacity",
        comment = """The total number of individuals that may attend an event or venue.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}