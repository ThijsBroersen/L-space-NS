package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LoanOrCredit extends OntologyDef(
        iri = "http://schema.org/LoanOrCredit",
        iris = Set("http://schema.org/LoanOrCredit"),
        label = "LoanOrCredit",
        comment = """A financial product for the loaning of an amount of money under agreed terms and charges.""",
        `@extends` = () => List(FinancialProduct.ontology)
       ){
object keys extends lspace.ns.vocab.schema.FinancialProduct.Properties{
lazy val loanType = lspace.ns.vocab.schema.loanType.property
lazy val recourseLoan = lspace.ns.vocab.schema.recourseLoan.property
lazy val currency = lspace.ns.vocab.schema.currency.property
lazy val gracePeriod = lspace.ns.vocab.schema.gracePeriod.property
lazy val requiredCollateral = lspace.ns.vocab.schema.requiredCollateral.property
}
override lazy val properties: List[LProperty] = List(loanType, recourseLoan, currency, gracePeriod, requiredCollateral)
trait Properties extends lspace.ns.vocab.schema.FinancialProduct.Properties{
lazy val loanType = lspace.ns.vocab.schema.loanType.property
lazy val recourseLoan = lspace.ns.vocab.schema.recourseLoan.property
lazy val currency = lspace.ns.vocab.schema.currency.property
lazy val gracePeriod = lspace.ns.vocab.schema.gracePeriod.property
lazy val requiredCollateral = lspace.ns.vocab.schema.requiredCollateral.property
}
}