package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalOrganization extends OntologyDef(
        iri = "http://schema.org/MedicalOrganization",
        iris = Set("http://schema.org/MedicalOrganization"),
        label = "MedicalOrganization",
        comment = """A medical organization (physical or not), such as hospital, institution or clinic.""",
        `@extends` = () => List(Organization.ontology)
       ){
}