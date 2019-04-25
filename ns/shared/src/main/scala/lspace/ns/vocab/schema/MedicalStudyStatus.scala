package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalStudyStatus
    extends OntologyDef(
      iri = "http://schema.org/MedicalStudyStatus",
      iris = Set("http://schema.org/MedicalStudyStatus"),
      label = "MedicalStudyStatus",
      comment = """The status of a medical study. Enumerated type.""",
      `@extends` = () => List(MedicalEnumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties {}
}
