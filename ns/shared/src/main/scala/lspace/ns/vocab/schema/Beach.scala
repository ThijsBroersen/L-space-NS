package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Beach extends OntologyDef(
        iri = "http://schema.org/Beach",
        iris = Set("http://schema.org/Beach"),
        label = "Beach",
        comment = """Beach.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}