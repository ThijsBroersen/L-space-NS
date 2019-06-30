package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RsvpResponseType extends OntologyDef(
        iri = "http://schema.org/RsvpResponseType",
        iris = Set("http://schema.org/RsvpResponseType"),
        label = "RsvpResponseType",
        comment = """RsvpResponseType is an enumeration type whose instances represent responding to an RSVP request.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}