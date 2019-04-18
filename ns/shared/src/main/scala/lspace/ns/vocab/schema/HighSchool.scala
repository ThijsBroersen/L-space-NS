package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object HighSchool
    extends OntologyDef(
      iri = "http://schema.org/HighSchool",
      iris = Set("http://schema.org/HighSchool"),
      label = "HighSchool",
      comment = """A high school.""",
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
