package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InsertAction extends OntologyDef(
        iri = "http://schema.org/InsertAction",
        iris = Set("http://schema.org/InsertAction"),
        label = "InsertAction",
        comment = """The act of adding at a specific location in an ordered collection.""",
        `@extends` = () => List(AddAction.ontology)
       ){
}