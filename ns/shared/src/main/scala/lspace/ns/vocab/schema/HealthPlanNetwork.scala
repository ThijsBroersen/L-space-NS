package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HealthPlanNetwork extends OntologyDef(
        iri = "http://schema.org/HealthPlanNetwork",
        iris = Set("http://schema.org/HealthPlanNetwork"),
        label = "HealthPlanNetwork",
        comment = """A US-style health insurance plan network.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val healthPlanCostSharing = lspace.ns.vocab.schema.healthPlanCostSharing.property
lazy val healthPlanNetworkId = lspace.ns.vocab.schema.healthPlanNetworkId.property
lazy val healthPlanNetworkTier = lspace.ns.vocab.schema.healthPlanNetworkTier.property
}
override lazy val properties: List[LProperty] = List(healthPlanCostSharing, healthPlanNetworkId, healthPlanNetworkTier)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val healthPlanCostSharing = lspace.ns.vocab.schema.healthPlanCostSharing.property
lazy val healthPlanNetworkId = lspace.ns.vocab.schema.healthPlanNetworkId.property
lazy val healthPlanNetworkTier = lspace.ns.vocab.schema.healthPlanNetworkTier.property
}
}