package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalGuidelineContraindication
    extends OntologyDef(
      iri = "http://schema.org/MedicalGuidelineContraindication",
      iris = Set("http://schema.org/MedicalGuidelineContraindication"),
      label = "MedicalGuidelineContraindication",
      comment =
        """A guideline contraindication that designates a process as harmful and where quality of the data supporting the contraindication is sound.""",
      `@extends` = () => List(MedicalGuideline.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalGuideline.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalGuideline.Properties {}
}
