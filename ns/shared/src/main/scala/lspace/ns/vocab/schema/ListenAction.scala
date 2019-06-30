package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ListenAction extends OntologyDef(
        iri = "http://schema.org/ListenAction",
        iris = Set("http://schema.org/ListenAction"),
        label = "ListenAction",
        comment = """The act of consuming audio content.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
}