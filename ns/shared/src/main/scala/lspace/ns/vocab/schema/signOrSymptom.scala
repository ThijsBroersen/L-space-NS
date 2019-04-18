package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object signOrSymptom
    extends PropertyDef(
      iri = "http://schema.org/signOrSymptom",
      iris = Set("http://schema.org/signOrSymptom"),
      label = "signOrSymptom",
      comment =
        """A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalSignOrSymptom.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
