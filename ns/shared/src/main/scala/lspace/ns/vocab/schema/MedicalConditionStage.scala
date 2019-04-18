package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalConditionStage
    extends OntologyDef(
      iri = "http://schema.org/MedicalConditionStage",
      iris = Set("http://schema.org/MedicalConditionStage"),
      label = "MedicalConditionStage",
      comment = """A stage of a medical condition, such as 'Stage IIIa'.""",
      `@extends` = () => List(MedicalIntangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalIntangible.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalIntangible.Properties {}
}
