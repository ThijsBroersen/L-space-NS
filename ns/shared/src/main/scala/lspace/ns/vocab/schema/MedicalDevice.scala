package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalDevice
    extends OntologyDef(
      iri = "http://schema.org/MedicalDevice",
      iris = Set("http://schema.org/MedicalDevice"),
      label = "MedicalDevice",
      comment = """Any object used in a medical capacity, such as to diagnose or treat a patient.""",
      `@extends` = () => List(MedicalEntity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties {}
}
