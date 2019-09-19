package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Drug extends OntologyDef(
        iri = "http://schema.org/Drug",
        iris = Set("http://schema.org/Drug"),
        label = "Drug",
        comment = """A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them.""",
        `@extends` = () => List(Substance.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Substance.Properties{
lazy val administrationRoute = lspace.ns.vocab.schema.administrationRoute.property
lazy val alcoholWarning = lspace.ns.vocab.schema.alcoholWarning.property
lazy val availableStrength = lspace.ns.vocab.schema.availableStrength.property
lazy val breastfeedingWarning = lspace.ns.vocab.schema.breastfeedingWarning.property
lazy val clinicalPharmacology = lspace.ns.vocab.schema.clinicalPharmacology.property
lazy val cost = lspace.ns.vocab.schema.cost.property
lazy val dosageForm = lspace.ns.vocab.schema.dosageForm.property
lazy val doseSchedule = lspace.ns.vocab.schema.doseSchedule.property
lazy val drugClass = lspace.ns.vocab.schema.drugClass.property
lazy val drugUnit = lspace.ns.vocab.schema.drugUnit.property
lazy val foodWarning = lspace.ns.vocab.schema.foodWarning.property
lazy val includedInHealthInsurancePlan = lspace.ns.vocab.schema.includedInHealthInsurancePlan.property
lazy val interactingDrug = lspace.ns.vocab.schema.interactingDrug.property
lazy val isAvailableGenerically = lspace.ns.vocab.schema.isAvailableGenerically.property
lazy val isProprietary = lspace.ns.vocab.schema.isProprietary.property
lazy val labelDetails = lspace.ns.vocab.schema.labelDetails.property
lazy val manufacturer = lspace.ns.vocab.schema.manufacturer.property
lazy val mechanismOfAction = lspace.ns.vocab.schema.mechanismOfAction.property
lazy val nonProprietaryName = lspace.ns.vocab.schema.nonProprietaryName.property
lazy val overdosage = lspace.ns.vocab.schema.overdosage.property
lazy val pregnancyCategory = lspace.ns.vocab.schema.pregnancyCategory.property
lazy val pregnancyWarning = lspace.ns.vocab.schema.pregnancyWarning.property
lazy val prescribingInfo = lspace.ns.vocab.schema.prescribingInfo.property
lazy val prescriptionStatus = lspace.ns.vocab.schema.prescriptionStatus.property
lazy val proprietaryName = lspace.ns.vocab.schema.proprietaryName.property
lazy val relatedDrug = lspace.ns.vocab.schema.relatedDrug.property
lazy val rxcui = lspace.ns.vocab.schema.rxcui.property
lazy val warning = lspace.ns.vocab.schema.warning.property
}
override lazy val properties: List[LProperty] = List(administrationRoute, alcoholWarning, availableStrength, breastfeedingWarning, clinicalPharmacology, cost, dosageForm, doseSchedule, drugClass, drugUnit, foodWarning, includedInHealthInsurancePlan, interactingDrug, isAvailableGenerically, isProprietary, labelDetails, manufacturer, mechanismOfAction, nonProprietaryName, overdosage, pregnancyCategory, pregnancyWarning, prescribingInfo, prescriptionStatus, proprietaryName, relatedDrug, rxcui, warning)
trait Properties extends lspace.ns.vocab.schema.Substance.Properties{
lazy val administrationRoute = lspace.ns.vocab.schema.administrationRoute.property
lazy val alcoholWarning = lspace.ns.vocab.schema.alcoholWarning.property
lazy val availableStrength = lspace.ns.vocab.schema.availableStrength.property
lazy val breastfeedingWarning = lspace.ns.vocab.schema.breastfeedingWarning.property
lazy val clinicalPharmacology = lspace.ns.vocab.schema.clinicalPharmacology.property
lazy val cost = lspace.ns.vocab.schema.cost.property
lazy val dosageForm = lspace.ns.vocab.schema.dosageForm.property
lazy val doseSchedule = lspace.ns.vocab.schema.doseSchedule.property
lazy val drugClass = lspace.ns.vocab.schema.drugClass.property
lazy val drugUnit = lspace.ns.vocab.schema.drugUnit.property
lazy val foodWarning = lspace.ns.vocab.schema.foodWarning.property
lazy val includedInHealthInsurancePlan = lspace.ns.vocab.schema.includedInHealthInsurancePlan.property
lazy val interactingDrug = lspace.ns.vocab.schema.interactingDrug.property
lazy val isAvailableGenerically = lspace.ns.vocab.schema.isAvailableGenerically.property
lazy val isProprietary = lspace.ns.vocab.schema.isProprietary.property
lazy val labelDetails = lspace.ns.vocab.schema.labelDetails.property
lazy val manufacturer = lspace.ns.vocab.schema.manufacturer.property
lazy val mechanismOfAction = lspace.ns.vocab.schema.mechanismOfAction.property
lazy val nonProprietaryName = lspace.ns.vocab.schema.nonProprietaryName.property
lazy val overdosage = lspace.ns.vocab.schema.overdosage.property
lazy val pregnancyCategory = lspace.ns.vocab.schema.pregnancyCategory.property
lazy val pregnancyWarning = lspace.ns.vocab.schema.pregnancyWarning.property
lazy val prescribingInfo = lspace.ns.vocab.schema.prescribingInfo.property
lazy val prescriptionStatus = lspace.ns.vocab.schema.prescriptionStatus.property
lazy val proprietaryName = lspace.ns.vocab.schema.proprietaryName.property
lazy val relatedDrug = lspace.ns.vocab.schema.relatedDrug.property
lazy val rxcui = lspace.ns.vocab.schema.rxcui.property
lazy val warning = lspace.ns.vocab.schema.warning.property
}
}