package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GovernmentOrganization extends OntologyDef(
        iri = "http://schema.org/GovernmentOrganization",
        iris = Set("http://schema.org/GovernmentOrganization"),
        label = "GovernmentOrganization",
        comment = """A governmental organization or agency.""",
        `@extends` = () => List(Organization.ontology)
       ){
}