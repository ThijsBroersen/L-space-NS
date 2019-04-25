package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object healthPlanCoinsuranceRate
    extends PropertyDef(
      iri = "http://schema.org/healthPlanCoinsuranceRate",
      iris = Set("http://schema.org/healthPlanCoinsuranceRate"),
      label = "healthPlanCoinsuranceRate",
      comment = """Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
