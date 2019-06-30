package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RsvpAction extends OntologyDef(
        iri = "http://schema.org/RsvpAction",
        iris = Set("http://schema.org/RsvpAction"),
        label = "RsvpAction",
        comment = """The act of notifying an event organizer as to whether you expect to attend the event.""",
        `@extends` = () => List(InformAction.ontology)
       ){
}