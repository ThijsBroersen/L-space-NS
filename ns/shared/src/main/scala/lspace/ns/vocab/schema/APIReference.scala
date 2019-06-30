package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object APIReference extends OntologyDef(
        iri = "http://schema.org/APIReference",
        iris = Set("http://schema.org/APIReference"),
        label = "APIReference",
        comment = """Reference documentation for application programming interfaces (APIs).""",
        `@extends` = () => List(TechArticle.ontology)
       ){
}