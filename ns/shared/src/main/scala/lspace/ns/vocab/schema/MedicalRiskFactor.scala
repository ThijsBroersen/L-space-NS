package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalRiskFactor
    extends OntologyDef(
      iri = "http://schema.org/MedicalRiskFactor",
      iris = Set("http://schema.org/MedicalRiskFactor"),
      label = "MedicalRiskFactor",
      comment =
        """A risk factor is anything that increases a person's likelihood of developing or contracting a disease, medical condition, or complication.""",
      `@extends` = () => List(MedicalEntity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
}
