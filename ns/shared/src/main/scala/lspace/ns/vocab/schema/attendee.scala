package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object attendee extends PropertyDef(
        iri = "https://schema.org/attendee",
        iris = Set("https://schema.org/attendee"),
        label = "attendee",
        comment = """A person or organization attending the event.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}