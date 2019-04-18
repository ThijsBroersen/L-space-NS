package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalOrganization
    extends OntologyDef(
      iri = "http://schema.org/MedicalOrganization",
      iris = Set("http://schema.org/MedicalOrganization"),
      label = "MedicalOrganization",
      comment = """A medical organization (physical or not), such as hospital, institution or clinic.""",
      `@extends` = () => List(Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Organization.Properties {
    lazy val medicalSpecialty = lspace.ns.vocab.schema.medicalSpecialty.property
  }
  override lazy val properties: List[Property] = List(medicalSpecialty)
  trait Properties extends lspace.ns.vocab.schema.Organization.Properties {
    lazy val medicalSpecialty = lspace.ns.vocab.schema.medicalSpecialty.property
  }
}
