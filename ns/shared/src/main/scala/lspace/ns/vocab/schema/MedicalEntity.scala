package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalEntity extends OntologyDef(
        iri = "http://schema.org/MedicalEntity",
        iris = Set("http://schema.org/MedicalEntity"),
        label = "MedicalEntity",
        comment = """The most generic type of entity related to health and the practice of medicine.""",
        `@extends` = List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
lazy val code = lspace.ns.vocab.schema.code.property
lazy val guideline = lspace.ns.vocab.schema.guideline.property
lazy val legalStatus = lspace.ns.vocab.schema.legalStatus.property
lazy val medicineSystem = lspace.ns.vocab.schema.medicineSystem.property
lazy val recognizingAuthority = lspace.ns.vocab.schema.recognizingAuthority.property
lazy val relevantSpecialty = lspace.ns.vocab.schema.relevantSpecialty.property
lazy val study = lspace.ns.vocab.schema.study.property
}
override lazy val properties: List[LProperty] = List(code, guideline, legalStatus, medicineSystem, recognizingAuthority, relevantSpecialty, study)
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
lazy val code = lspace.ns.vocab.schema.code.property
lazy val guideline = lspace.ns.vocab.schema.guideline.property
lazy val legalStatus = lspace.ns.vocab.schema.legalStatus.property
lazy val medicineSystem = lspace.ns.vocab.schema.medicineSystem.property
lazy val recognizingAuthority = lspace.ns.vocab.schema.recognizingAuthority.property
lazy val relevantSpecialty = lspace.ns.vocab.schema.relevantSpecialty.property
lazy val study = lspace.ns.vocab.schema.study.property
}
}