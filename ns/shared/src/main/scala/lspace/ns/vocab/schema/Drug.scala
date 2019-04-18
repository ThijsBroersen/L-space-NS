package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Drug
    extends OntologyDef(
      iri = "http://schema.org/Drug",
      iris = Set("http://schema.org/Drug"),
      label = "Drug",
      comment =
        """A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them.""",
      `@extends` = () => List(Substance.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Substance.Properties {
    lazy val includedInHealthInsurancePlan = lspace.ns.vocab.schema.includedInHealthInsurancePlan.property
    lazy val overdosage                    = lspace.ns.vocab.schema.overdosage.property
    lazy val dosageForm                    = lspace.ns.vocab.schema.dosageForm.property
    lazy val alcoholWarning                = lspace.ns.vocab.schema.alcoholWarning.property
    lazy val nonProprietaryName            = lspace.ns.vocab.schema.nonProprietaryName.property
    lazy val pregnancyWarning              = lspace.ns.vocab.schema.pregnancyWarning.property
    lazy val administrationRoute           = lspace.ns.vocab.schema.administrationRoute.property
    lazy val doseSchedule                  = lspace.ns.vocab.schema.doseSchedule.property
    lazy val labelDetails                  = lspace.ns.vocab.schema.labelDetails.property
    lazy val foodWarning                   = lspace.ns.vocab.schema.foodWarning.property
    lazy val clinicalPharmacology          = lspace.ns.vocab.schema.clinicalPharmacology.property
    lazy val isProprietary                 = lspace.ns.vocab.schema.isProprietary.property
    lazy val clincalPharmacology           = lspace.ns.vocab.schema.clincalPharmacology.property
    lazy val interactingDrug               = lspace.ns.vocab.schema.interactingDrug.property
  }
  override lazy val properties: List[Property] = List(
    includedInHealthInsurancePlan,
    overdosage,
    dosageForm,
    alcoholWarning,
    nonProprietaryName,
    pregnancyWarning,
    administrationRoute,
    doseSchedule,
    labelDetails,
    foodWarning,
    clinicalPharmacology,
    isProprietary,
    clincalPharmacology,
    interactingDrug
  )
  trait Properties extends lspace.ns.vocab.schema.Substance.Properties {
    lazy val includedInHealthInsurancePlan = lspace.ns.vocab.schema.includedInHealthInsurancePlan.property
    lazy val overdosage                    = lspace.ns.vocab.schema.overdosage.property
    lazy val dosageForm                    = lspace.ns.vocab.schema.dosageForm.property
    lazy val alcoholWarning                = lspace.ns.vocab.schema.alcoholWarning.property
    lazy val nonProprietaryName            = lspace.ns.vocab.schema.nonProprietaryName.property
    lazy val pregnancyWarning              = lspace.ns.vocab.schema.pregnancyWarning.property
    lazy val administrationRoute           = lspace.ns.vocab.schema.administrationRoute.property
    lazy val doseSchedule                  = lspace.ns.vocab.schema.doseSchedule.property
    lazy val labelDetails                  = lspace.ns.vocab.schema.labelDetails.property
    lazy val foodWarning                   = lspace.ns.vocab.schema.foodWarning.property
    lazy val clinicalPharmacology          = lspace.ns.vocab.schema.clinicalPharmacology.property
    lazy val isProprietary                 = lspace.ns.vocab.schema.isProprietary.property
    lazy val clincalPharmacology           = lspace.ns.vocab.schema.clincalPharmacology.property
    lazy val interactingDrug               = lspace.ns.vocab.schema.interactingDrug.property
  }
}
