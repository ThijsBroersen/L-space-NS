package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalScholarlyArticle
    extends OntologyDef(
      iri = "http://schema.org/MedicalScholarlyArticle",
      iris = Set("http://schema.org/MedicalScholarlyArticle"),
      label = "MedicalScholarlyArticle",
      comment = """A scholarly article in the medical domain.""",
      `@extends` = () => List(ScholarlyArticle.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ScholarlyArticle.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.ScholarlyArticle.Properties {}
}
