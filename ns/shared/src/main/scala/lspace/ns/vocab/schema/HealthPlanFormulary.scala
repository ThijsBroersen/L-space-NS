package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthPlanFormulary extends OntologyDef(
        iri = "http://schema.org/HealthPlanFormulary",
        iris = Set("http://schema.org/HealthPlanFormulary"),
        label = "HealthPlanFormulary",
        comment = """For a given health insurance plan, the specification for costs and coverage of prescription drugs.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val healthPlanDrugTier = lspace.ns.vocab.schema.healthPlanDrugTier.property
}
override lazy val properties: List[LProperty] = List(healthPlanDrugTier)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val healthPlanDrugTier = lspace.ns.vocab.schema.healthPlanDrugTier.property
}
}