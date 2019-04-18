package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object EducationalAudience
    extends OntologyDef(
      iri = "http://schema.org/EducationalAudience",
      iris = Set("http://schema.org/EducationalAudience"),
      label = "EducationalAudience",
      comment = """An EducationalAudience.""",
      `@extends` = () => List(Audience.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Audience.Properties {
    lazy val educationalRole = lspace.ns.vocab.schema.educationalRole.property
  }
  override lazy val properties: List[Property] = List(educationalRole)
  trait Properties extends lspace.ns.vocab.schema.Audience.Properties {
    lazy val educationalRole = lspace.ns.vocab.schema.educationalRole.property
  }
}
