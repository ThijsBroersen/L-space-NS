package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object healthPlanCopayOption
    extends PropertyDef(
      iri = "http://schema.org/healthPlanCopayOption",
      iris = Set("http://schema.org/healthPlanCopayOption"),
      label = "healthPlanCopayOption",
      comment = """Whether the copay is before or after deductible, etc. TODO: Is this a closed set?""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
