package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object loanRepaymentForm
    extends PropertyDef(
      iri = "http://schema.org/loanRepaymentForm",
      iris = Set("http://schema.org/loanRepaymentForm"),
      label = "loanRepaymentForm",
      comment =
        """A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.""",
      `@extends` = () => List(),
      `@range` = () => List(RepaymentSpecification.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
