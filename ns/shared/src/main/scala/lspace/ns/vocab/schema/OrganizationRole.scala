package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OrganizationRole extends OntologyDef(
        iri = "http://schema.org/OrganizationRole",
        iris = Set("http://schema.org/OrganizationRole"),
        label = "OrganizationRole",
        comment = """A subclass of Role used to describe roles within organizations.""",
        `@extends` = () => List(Role.ontology)
       ){
}