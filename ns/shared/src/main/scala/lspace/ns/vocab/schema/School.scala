package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object School
    extends OntologyDef(
      iri = "http://schema.org/School",
      iris = Set("http://schema.org/School"),
      label = "School",
      comment = """A school.""",
      `@extends` = () => List(EducationalOrganization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.EducationalOrganization.Properties {

    override lazy val alumni = lspace.ns.vocab.schema.alumni.property
  }
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.EducationalOrganization.Properties {

    override lazy val alumni = lspace.ns.vocab.schema.alumni.property
  }
}
