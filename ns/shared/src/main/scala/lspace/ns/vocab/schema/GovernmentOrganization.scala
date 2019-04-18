package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object GovernmentOrganization
    extends OntologyDef(
      iri = "http://schema.org/GovernmentOrganization",
      iris = Set("http://schema.org/GovernmentOrganization"),
      label = "GovernmentOrganization",
      comment = """A governmental organization or agency.""",
      `@extends` = () => List(Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Organization.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Organization.Properties {}
}
