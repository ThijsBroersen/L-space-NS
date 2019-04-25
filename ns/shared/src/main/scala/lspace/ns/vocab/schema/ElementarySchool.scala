package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ElementarySchool
    extends OntologyDef(
      iri = "http://schema.org/ElementarySchool",
      iris = Set("http://schema.org/ElementarySchool"),
      label = "ElementarySchool",
      comment = """An elementary school.""",
      `@extends` = () => List(EducationalOrganization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.EducationalOrganization.Properties {

    override lazy val alumni = lspace.ns.vocab.schema.alumni.property
  }
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.EducationalOrganization.Properties {

    override lazy val alumni = lspace.ns.vocab.schema.alumni.property
  }
}
