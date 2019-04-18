package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object healthPlanDrugOption
    extends PropertyDef(
      iri = "http://schema.org/healthPlanDrugOption",
      iris = Set("http://schema.org/healthPlanDrugOption"),
      label = "healthPlanDrugOption",
      comment = """TODO.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
