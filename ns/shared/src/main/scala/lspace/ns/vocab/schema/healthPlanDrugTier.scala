package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object healthPlanDrugTier
    extends PropertyDef(
      iri = "http://schema.org/healthPlanDrugTier",
      iris = Set("http://schema.org/healthPlanDrugTier"),
      label = "healthPlanDrugTier",
      comment = """The tier(s) of drugs offered by this formulary or insurance plan.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
