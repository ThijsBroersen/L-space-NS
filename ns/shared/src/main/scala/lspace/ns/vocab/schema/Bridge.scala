package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Bridge extends OntologyDef(
        iri = "http://schema.org/Bridge",
        iris = Set("http://schema.org/Bridge"),
        label = "Bridge",
        comment = """A bridge.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}