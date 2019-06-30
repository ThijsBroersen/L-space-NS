package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NGO extends OntologyDef(
        iri = "http://schema.org/NGO",
        iris = Set("http://schema.org/NGO"),
        label = "NGO",
        comment = """Organization: Non-governmental Organization.""",
        `@extends` = () => List(Organization.ontology)
       ){
}