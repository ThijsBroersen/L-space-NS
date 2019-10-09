package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthPlanCostSharingSpecification extends OntologyDef(
        iri = "http://schema.org/HealthPlanCostSharingSpecification",
        iris = Set("http://schema.org/HealthPlanCostSharingSpecification"),
        label = "HealthPlanCostSharingSpecification",
        comment = """A description of costs to the patient under a given network or formulary.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val healthPlanCoinsuranceOption = lspace.ns.vocab.schema.healthPlanCoinsuranceOption.property
lazy val healthPlanCoinsuranceRate = lspace.ns.vocab.schema.healthPlanCoinsuranceRate.property
lazy val healthPlanCopay = lspace.ns.vocab.schema.healthPlanCopay.property
lazy val healthPlanCopayOption = lspace.ns.vocab.schema.healthPlanCopayOption.property
lazy val healthPlanPharmacyCategory = lspace.ns.vocab.schema.healthPlanPharmacyCategory.property
}
override lazy val properties: List[LProperty] = List(healthPlanCoinsuranceOption, healthPlanCoinsuranceRate, healthPlanCopay, healthPlanCopayOption, healthPlanPharmacyCategory)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val healthPlanCoinsuranceOption = lspace.ns.vocab.schema.healthPlanCoinsuranceOption.property
lazy val healthPlanCoinsuranceRate = lspace.ns.vocab.schema.healthPlanCoinsuranceRate.property
lazy val healthPlanCopay = lspace.ns.vocab.schema.healthPlanCopay.property
lazy val healthPlanCopayOption = lspace.ns.vocab.schema.healthPlanCopayOption.property
lazy val healthPlanPharmacyCategory = lspace.ns.vocab.schema.healthPlanPharmacyCategory.property
}
}