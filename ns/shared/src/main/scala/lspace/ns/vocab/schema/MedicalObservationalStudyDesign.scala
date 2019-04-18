package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalObservationalStudyDesign
    extends OntologyDef(
      iri = "http://schema.org/MedicalObservationalStudyDesign",
      iris = Set("http://schema.org/MedicalObservationalStudyDesign"),
      label = "MedicalObservationalStudyDesign",
      comment = """Design models for observational medical studies. Enumerated type.""",
      `@extends` = () => List(MedicalEnumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties {}
}
