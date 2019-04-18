package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalSignOrSymptom
    extends OntologyDef(
      iri = "http://schema.org/MedicalSignOrSymptom",
      iris = Set("http://schema.org/MedicalSignOrSymptom"),
      label = "MedicalSignOrSymptom",
      comment =
        """Any feature associated or not with a medical condition. In medicine a symptom is generally subjective while a sign is objective.""",
      `@extends` = () => List(MedicalCondition.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalCondition.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalCondition.Properties {}
}
