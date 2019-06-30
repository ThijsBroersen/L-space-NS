package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NewsMediaOrganization extends OntologyDef(
        iri = "http://schema.org/NewsMediaOrganization",
        iris = Set("http://schema.org/NewsMediaOrganization"),
        label = "NewsMediaOrganization",
        comment = """A News/Media organization such as a newspaper or TV station.""",
        `@extends` = () => List(Organization.ontology)
       ){
}