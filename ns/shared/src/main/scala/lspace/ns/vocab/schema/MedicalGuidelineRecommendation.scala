package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalGuidelineRecommendation
    extends OntologyDef(
      iri = "http://schema.org/MedicalGuidelineRecommendation",
      iris = Set("http://schema.org/MedicalGuidelineRecommendation"),
      label = "MedicalGuidelineRecommendation",
      comment =
        """A guideline recommendation that is regarded as efficacious and where quality of the data supporting the recommendation is sound.""",
      `@extends` = () => List(MedicalGuideline.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalGuideline.Properties {
    lazy val recommendationStrength = lspace.ns.vocab.schema.recommendationStrength.property
  }
  override lazy val properties: List[Property] = List(recommendationStrength)
  trait Properties extends lspace.ns.vocab.schema.MedicalGuideline.Properties {
    lazy val recommendationStrength = lspace.ns.vocab.schema.recommendationStrength.property
  }
}
