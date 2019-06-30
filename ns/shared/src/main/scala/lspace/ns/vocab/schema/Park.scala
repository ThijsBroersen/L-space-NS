package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Park extends OntologyDef(
        iri = "http://schema.org/Park",
        iris = Set("http://schema.org/Park"),
        label = "Park",
        comment = """A park.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}