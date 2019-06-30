package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CommunicateAction extends OntologyDef(
        iri = "http://schema.org/CommunicateAction",
        iris = Set("http://schema.org/CommunicateAction"),
        label = "CommunicateAction",
        comment = """The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.""",
        `@extends` = () => List(InteractAction.ontology)
       ){
}