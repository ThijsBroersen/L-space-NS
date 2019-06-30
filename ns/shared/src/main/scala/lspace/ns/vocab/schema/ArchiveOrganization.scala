package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ArchiveOrganization extends OntologyDef(
        iri = "http://schema.org/ArchiveOrganization",
        iris = Set("http://schema.org/ArchiveOrganization"),
        label = "ArchiveOrganization",
        comment = """An organization with archival holdings. An organization which keeps and preserves archival material and typically makes it accessible to the public.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}