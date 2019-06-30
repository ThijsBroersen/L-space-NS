package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object School extends OntologyDef(
        iri = "http://schema.org/School",
        iris = Set("http://schema.org/School"),
        label = "School",
        comment = """A school.""",
        `@extends` = () => List(EducationalOrganization.ontology)
       ){
}