package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DislikeAction extends OntologyDef(
        iri = "http://schema.org/DislikeAction",
        iris = Set("http://schema.org/DislikeAction"),
        label = "DislikeAction",
        comment = """The act of expressing a negative sentiment about the object. An agent dislikes an object (a proposition, topic or theme) with participants.""",
        `@extends` = () => List(ReactAction.ontology)
       ){
}