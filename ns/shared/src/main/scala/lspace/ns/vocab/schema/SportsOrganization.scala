package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportsOrganization extends OntologyDef(
        iri = "http://schema.org/SportsOrganization",
        iris = Set("http://schema.org/SportsOrganization"),
        label = "SportsOrganization",
        comment = """Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.""",
        `@extends` = () => List(Organization.ontology)
       ){
}