package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalGuideline extends OntologyDef(
        iri = "http://schema.org/MedicalGuideline",
        iris = Set("http://schema.org/MedicalGuideline"),
        label = "MedicalGuideline",
        comment = """Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.""",
        `@extends` = List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val evidenceLevel = lspace.ns.vocab.schema.evidenceLevel.property
lazy val evidenceOrigin = lspace.ns.vocab.schema.evidenceOrigin.property
lazy val guidelineDate = lspace.ns.vocab.schema.guidelineDate.property
lazy val guidelineSubject = lspace.ns.vocab.schema.guidelineSubject.property
}
override lazy val properties: List[LProperty] = List(evidenceLevel, evidenceOrigin, guidelineDate, guidelineSubject)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val evidenceLevel = lspace.ns.vocab.schema.evidenceLevel.property
lazy val evidenceOrigin = lspace.ns.vocab.schema.evidenceOrigin.property
lazy val guidelineDate = lspace.ns.vocab.schema.guidelineDate.property
lazy val guidelineSubject = lspace.ns.vocab.schema.guidelineSubject.property
}
}