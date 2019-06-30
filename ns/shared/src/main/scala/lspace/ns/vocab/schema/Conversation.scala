package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Conversation extends OntologyDef(
        iri = "http://schema.org/Conversation",
        iris = Set("http://schema.org/Conversation"),
        label = "Conversation",
        comment = """One or more messages between organizations or people on a particular topic. Individual messages can be linked to the conversation with isPartOf or hasPart properties.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}