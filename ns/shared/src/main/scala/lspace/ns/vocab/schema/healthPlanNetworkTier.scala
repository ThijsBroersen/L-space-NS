package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object healthPlanNetworkTier
    extends PropertyDef(
      iri = "http://schema.org/healthPlanNetworkTier",
      iris = Set("http://schema.org/healthPlanNetworkTier"),
      label = "healthPlanNetworkTier",
      comment = """The tier(s) for this network.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
