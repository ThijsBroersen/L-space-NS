package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AgreeAction extends OntologyDef(
        iri = "http://schema.org/AgreeAction",
        iris = Set("http://schema.org/AgreeAction"),
        label = "AgreeAction",
        comment = """The act of expressing a consistency of opinion with the object. An agent agrees to/about an object (a proposition, topic or theme) with participants.""",
        `@extends` = () => List(ReactAction.ontology)
       ){
}