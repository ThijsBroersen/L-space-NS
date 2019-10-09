package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RepaymentSpecification extends OntologyDef(
        iri = "http://schema.org/RepaymentSpecification",
        iris = Set("http://schema.org/RepaymentSpecification"),
        label = "RepaymentSpecification",
        comment = """A structured value representing repayment.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val downPayment = lspace.ns.vocab.schema.downPayment.property
lazy val earlyPrepaymentPenalty = lspace.ns.vocab.schema.earlyPrepaymentPenalty.property
lazy val loanPaymentAmount = lspace.ns.vocab.schema.loanPaymentAmount.property
lazy val loanPaymentFrequency = lspace.ns.vocab.schema.loanPaymentFrequency.property
lazy val numberOfLoanPayments = lspace.ns.vocab.schema.numberOfLoanPayments.property
}
override lazy val properties: List[LProperty] = List(downPayment, earlyPrepaymentPenalty, loanPaymentAmount, loanPaymentFrequency, numberOfLoanPayments)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val downPayment = lspace.ns.vocab.schema.downPayment.property
lazy val earlyPrepaymentPenalty = lspace.ns.vocab.schema.earlyPrepaymentPenalty.property
lazy val loanPaymentAmount = lspace.ns.vocab.schema.loanPaymentAmount.property
lazy val loanPaymentFrequency = lspace.ns.vocab.schema.loanPaymentFrequency.property
lazy val numberOfLoanPayments = lspace.ns.vocab.schema.numberOfLoanPayments.property
}
}