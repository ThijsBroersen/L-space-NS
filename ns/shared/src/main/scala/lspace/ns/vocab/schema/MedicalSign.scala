package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalSign
    extends OntologyDef(
      iri = "http://schema.org/MedicalSign",
      iris = Set("http://schema.org/MedicalSign"),
      label = "MedicalSign",
      comment =
        """Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.""",
      `@extends` = () => List(MedicalSignOrSymptom.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalSignOrSymptom.Properties {
    lazy val identifyingTest            = lspace.ns.vocab.schema.identifyingTest.property
    lazy val identifyingExam            = lspace.ns.vocab.schema.identifyingExam.property
    override lazy val possibleTreatment = lspace.ns.vocab.schema.possibleTreatment.property
  }
  override lazy val properties: List[LProperty] = List(identifyingTest, identifyingExam)
  trait Properties extends lspace.ns.vocab.schema.MedicalSignOrSymptom.Properties {
    lazy val identifyingTest            = lspace.ns.vocab.schema.identifyingTest.property
    lazy val identifyingExam            = lspace.ns.vocab.schema.identifyingExam.property
    override lazy val possibleTreatment = lspace.ns.vocab.schema.possibleTreatment.property
  }
}
