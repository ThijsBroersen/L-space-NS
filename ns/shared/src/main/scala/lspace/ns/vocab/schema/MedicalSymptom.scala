package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalSymptom
    extends OntologyDef(
      iri = "http://schema.org/MedicalSymptom",
      iris = Set("http://schema.org/MedicalSymptom"),
      label = "MedicalSymptom",
      comment =
        """Any complaint sensed and expressed by the patient (therefore defined as subjective)  like stomachache, lower-back pain, or fatigue.""",
      `@extends` = () => List(MedicalSignOrSymptom.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalSignOrSymptom.Properties {

    override lazy val possibleTreatment = lspace.ns.vocab.schema.possibleTreatment.property
  }
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalSignOrSymptom.Properties {

    override lazy val possibleTreatment = lspace.ns.vocab.schema.possibleTreatment.property
  }
}
