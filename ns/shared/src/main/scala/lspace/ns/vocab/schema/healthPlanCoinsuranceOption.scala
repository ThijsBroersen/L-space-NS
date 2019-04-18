package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object healthPlanCoinsuranceOption
    extends PropertyDef(
      iri = "http://schema.org/healthPlanCoinsuranceOption",
      iris = Set("http://schema.org/healthPlanCoinsuranceOption"),
      label = "healthPlanCoinsuranceOption",
      comment = """Whether the coinsurance applies before or after deductible, etc. TODO: Is this a closed set?""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
