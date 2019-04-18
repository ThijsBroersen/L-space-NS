package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthInsurancePlan extends OntologyDef(
        iri = "http://schema.org/HealthInsurancePlan",
        iris = Set("http://schema.org/HealthInsurancePlan"),
        label = "HealthInsurancePlan",
        comment = """A US-style health insurance plan, including PPOs, EPOs, and HMOs.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val benefitsSummaryUrl = lspace.ns.vocab.schema.benefitsSummaryUrl.property
lazy val includesHealthPlanNetwork = lspace.ns.vocab.schema.includesHealthPlanNetwork.property
lazy val healthPlanDrugTier = lspace.ns.vocab.schema.healthPlanDrugTier.property
lazy val healthPlanDrugOption = lspace.ns.vocab.schema.healthPlanDrugOption.property
lazy val healthPlanId = lspace.ns.vocab.schema.healthPlanId.property
lazy val contactPoint = lspace.ns.vocab.schema.contactPoint.property
lazy val usesHealthPlanIdStandard = lspace.ns.vocab.schema.usesHealthPlanIdStandard.property
}
override lazy val properties: List[LProperty] = List(benefitsSummaryUrl, includesHealthPlanNetwork, healthPlanDrugTier, healthPlanDrugOption, healthPlanId, contactPoint, usesHealthPlanIdStandard)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val benefitsSummaryUrl = lspace.ns.vocab.schema.benefitsSummaryUrl.property
lazy val includesHealthPlanNetwork = lspace.ns.vocab.schema.includesHealthPlanNetwork.property
lazy val healthPlanDrugTier = lspace.ns.vocab.schema.healthPlanDrugTier.property
lazy val healthPlanDrugOption = lspace.ns.vocab.schema.healthPlanDrugOption.property
lazy val healthPlanId = lspace.ns.vocab.schema.healthPlanId.property
lazy val contactPoint = lspace.ns.vocab.schema.contactPoint.property
lazy val usesHealthPlanIdStandard = lspace.ns.vocab.schema.usesHealthPlanIdStandard.property
}
}