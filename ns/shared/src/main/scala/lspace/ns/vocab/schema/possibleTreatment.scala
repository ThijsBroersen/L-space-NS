package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object possibleTreatment
    extends PropertyDef(
      iri = "http://schema.org/possibleTreatment",
      iris = Set("http://schema.org/possibleTreatment"),
      label = "possibleTreatment",
      comment = """A possible treatment to address this condition, sign or symptom.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalTherapy.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
