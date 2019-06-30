package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Zoo extends OntologyDef(
        iri = "http://schema.org/Zoo",
        iris = Set("http://schema.org/Zoo"),
        label = "Zoo",
        comment = """A zoo.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}