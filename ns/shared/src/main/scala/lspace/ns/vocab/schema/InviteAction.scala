package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InviteAction extends OntologyDef(
        iri = "http://schema.org/InviteAction",
        iris = Set("http://schema.org/InviteAction"),
        label = "InviteAction",
        comment = """The act of asking someone to attend an event. Reciprocal of RsvpAction.""",
        `@extends` = () => List(CommunicateAction.ontology)
       ){
}