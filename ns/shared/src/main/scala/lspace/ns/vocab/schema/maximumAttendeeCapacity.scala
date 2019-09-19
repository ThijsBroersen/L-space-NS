package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object maximumAttendeeCapacity extends PropertyDef(
        iri = "http://schema.org/maximumAttendeeCapacity",
        iris = Set("http://schema.org/maximumAttendeeCapacity"),
        label = "maximumAttendeeCapacity",
        comment = """The total number of individuals that may attend an event or venue.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}