package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object NGO
    extends OntologyDef(
      iri = "http://schema.org/NGO",
      iris = Set("http://schema.org/NGO"),
      label = "NGO",
      comment = """Organization: Non-governmental Organization.""",
      `@extends` = () => List(Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Organization.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Organization.Properties {}
}
