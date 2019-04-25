package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EducationalOccupationalCredential
    extends OntologyDef(
      iri = "http://schema.org/EducationalOccupationalCredential",
      iris = Set("http://schema.org/EducationalOccupationalCredential"),
      label = "EducationalOccupationalCredential",
      comment =
        """An educational or occupational credential. A diploma, academic degree, certification, qualification, badge, etc., that may be awarded to a person or other entity that meets the requirements defined by the credentialer.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val validIn            = lspace.ns.vocab.schema.validIn.property
    lazy val recognizedBy       = lspace.ns.vocab.schema.recognizedBy.property
    lazy val validFor           = lspace.ns.vocab.schema.validFor.property
    lazy val credentialCategory = lspace.ns.vocab.schema.credentialCategory.property
    lazy val educationalLevel   = lspace.ns.vocab.schema.educationalLevel.property
    lazy val competencyRequired = lspace.ns.vocab.schema.competencyRequired.property
  }
  override lazy val properties: List[LProperty] =
    List(validIn, recognizedBy, validFor, credentialCategory, educationalLevel, competencyRequired)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val validIn            = lspace.ns.vocab.schema.validIn.property
    lazy val recognizedBy       = lspace.ns.vocab.schema.recognizedBy.property
    lazy val validFor           = lspace.ns.vocab.schema.validFor.property
    lazy val credentialCategory = lspace.ns.vocab.schema.credentialCategory.property
    lazy val educationalLevel   = lspace.ns.vocab.schema.educationalLevel.property
    lazy val competencyRequired = lspace.ns.vocab.schema.competencyRequired.property
  }
}
