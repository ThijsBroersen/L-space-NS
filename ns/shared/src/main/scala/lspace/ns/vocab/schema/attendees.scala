package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object attendees extends PropertyDef(
        iri = "http://schema.org/attendees",
        iris = Set("http://schema.org/attendees"),
        label = "attendees",
        comment = """A person attending the event.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){
}