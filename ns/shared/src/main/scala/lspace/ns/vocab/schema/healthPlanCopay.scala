package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object healthPlanCopay
    extends PropertyDef(
      iri = "http://schema.org/healthPlanCopay",
      iris = Set("http://schema.org/healthPlanCopay"),
      label = "healthPlanCopay",
      comment = """Whether The copay amount.""",
      `@extends` = () => List(),
      `@range` = () => List(PriceSpecification.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
