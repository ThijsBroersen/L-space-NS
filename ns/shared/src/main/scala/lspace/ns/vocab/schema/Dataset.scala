package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Dataset extends OntologyDef(
        iri = "http://schema.org/Dataset",
        iris = Set("http://schema.org/Dataset"),
        label = "Dataset",
        comment = """A body of structured information describing some topic(s) of interest.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}