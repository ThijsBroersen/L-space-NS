package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WriteAction extends OntologyDef(
        iri = "http://schema.org/WriteAction",
        iris = Set("http://schema.org/WriteAction"),
        label = "WriteAction",
        comment = """The act of authoring written creative content.""",
        `@extends` = () => List(CreateAction.ontology)
       ){
}