package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object riskFactor
    extends PropertyDef(
      iri = "http://schema.org/riskFactor",
      iris = Set("http://schema.org/riskFactor"),
      label = "riskFactor",
      comment =
        """A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalRiskFactor.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
