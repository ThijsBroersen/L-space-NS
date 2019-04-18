package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object annualPercentageRate
    extends PropertyDef(
      iri = "http://schema.org/annualPercentageRate",
      iris = Set("http://schema.org/annualPercentageRate"),
      label = "annualPercentageRate",
      comment =
        """The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology, Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
