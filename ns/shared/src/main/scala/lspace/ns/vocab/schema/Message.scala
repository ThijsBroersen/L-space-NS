package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Message extends OntologyDef(
        iri = "http://schema.org/Message",
        iris = Set("http://schema.org/Message"),
        label = "Message",
        comment = """A single message from a sender to one or more organizations or people.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}