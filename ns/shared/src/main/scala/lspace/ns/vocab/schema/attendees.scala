package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object attendees extends PropertyDef(
        iri = "https://schema.org/attendees",
        iris = Set("https://schema.org/attendees"),
        label = "attendees",
        comment = """A person attending the event.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}