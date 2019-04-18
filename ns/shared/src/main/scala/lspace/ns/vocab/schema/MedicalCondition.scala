package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalCondition
    extends OntologyDef(
      iri = "http://schema.org/MedicalCondition",
      iris = Set("http://schema.org/MedicalCondition"),
      label = "MedicalCondition",
      comment =
        """Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.""",
      `@extends` = () => List(MedicalEntity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties {
    lazy val subtype               = lspace.ns.vocab.schema.subtype.property
    lazy val typicalTest           = lspace.ns.vocab.schema.typicalTest.property
    lazy val expectedPrognosis     = lspace.ns.vocab.schema.expectedPrognosis.property
    lazy val signOrSymptom         = lspace.ns.vocab.schema.signOrSymptom.property
    lazy val possibleTreatment     = lspace.ns.vocab.schema.possibleTreatment.property
    lazy val associatedAnatomy     = lspace.ns.vocab.schema.associatedAnatomy.property
    lazy val differentialDiagnosis = lspace.ns.vocab.schema.differentialDiagnosis.property
    lazy val status                = lspace.ns.vocab.schema.status.property
    lazy val pathophysiology       = lspace.ns.vocab.schema.pathophysiology.property
    lazy val secondaryPrevention   = lspace.ns.vocab.schema.secondaryPrevention.property
    lazy val primaryPrevention     = lspace.ns.vocab.schema.primaryPrevention.property
    lazy val cause                 = lspace.ns.vocab.schema.cause.property
    lazy val possibleComplication  = lspace.ns.vocab.schema.possibleComplication.property
    lazy val epidemiology          = lspace.ns.vocab.schema.epidemiology.property
    lazy val naturalProgression    = lspace.ns.vocab.schema.naturalProgression.property
    lazy val riskFactor            = lspace.ns.vocab.schema.riskFactor.property
    lazy val stage                 = lspace.ns.vocab.schema.stage.property
  }
  override lazy val properties: List[Property] = List(
    subtype,
    typicalTest,
    expectedPrognosis,
    signOrSymptom,
    possibleTreatment,
    associatedAnatomy,
    differentialDiagnosis,
    status,
    pathophysiology,
    secondaryPrevention,
    primaryPrevention,
    cause,
    possibleComplication,
    epidemiology,
    naturalProgression,
    riskFactor,
    stage
  )
  trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties {
    lazy val subtype               = lspace.ns.vocab.schema.subtype.property
    lazy val typicalTest           = lspace.ns.vocab.schema.typicalTest.property
    lazy val expectedPrognosis     = lspace.ns.vocab.schema.expectedPrognosis.property
    lazy val signOrSymptom         = lspace.ns.vocab.schema.signOrSymptom.property
    lazy val possibleTreatment     = lspace.ns.vocab.schema.possibleTreatment.property
    lazy val associatedAnatomy     = lspace.ns.vocab.schema.associatedAnatomy.property
    lazy val differentialDiagnosis = lspace.ns.vocab.schema.differentialDiagnosis.property
    lazy val status                = lspace.ns.vocab.schema.status.property
    lazy val pathophysiology       = lspace.ns.vocab.schema.pathophysiology.property
    lazy val secondaryPrevention   = lspace.ns.vocab.schema.secondaryPrevention.property
    lazy val primaryPrevention     = lspace.ns.vocab.schema.primaryPrevention.property
    lazy val cause                 = lspace.ns.vocab.schema.cause.property
    lazy val possibleComplication  = lspace.ns.vocab.schema.possibleComplication.property
    lazy val epidemiology          = lspace.ns.vocab.schema.epidemiology.property
    lazy val naturalProgression    = lspace.ns.vocab.schema.naturalProgression.property
    lazy val riskFactor            = lspace.ns.vocab.schema.riskFactor.property
    lazy val stage                 = lspace.ns.vocab.schema.stage.property
  }
}
