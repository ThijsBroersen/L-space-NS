package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object rsvpResponse extends PropertyDef(
        iri = "http://schema.org/rsvpResponse",
        iris = Set("http://schema.org/rsvpResponse"),
        label = "rsvpResponse",
        comment = """The response (yes, no, maybe) to the RSVP.""",
        `@extends` = List(),
        `@range` = List(RsvpResponseType.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}