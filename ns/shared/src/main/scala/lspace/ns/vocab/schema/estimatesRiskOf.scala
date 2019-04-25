package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object estimatesRiskOf
    extends PropertyDef(
      iri = "http://schema.org/estimatesRiskOf",
      iris = Set("http://schema.org/estimatesRiskOf"),
      label = "estimatesRiskOf",
      comment = """The condition, complication, or symptom whose risk is being estimated.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalEntity.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
