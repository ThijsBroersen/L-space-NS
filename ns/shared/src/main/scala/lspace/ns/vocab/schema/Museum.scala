package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Museum extends OntologyDef(
        iri = "http://schema.org/Museum",
        iris = Set("http://schema.org/Museum"),
        label = "Museum",
        comment = """A museum.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}