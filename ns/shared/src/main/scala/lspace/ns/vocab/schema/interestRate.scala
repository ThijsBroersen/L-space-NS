package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object interestRate
    extends PropertyDef(
      iri = "http://schema.org/interestRate",
      iris = Set("http://schema.org/interestRate"),
      label = "interestRate",
      comment =
        """The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
