package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object InvestmentOrDeposit
    extends OntologyDef(
      iri = "http://schema.org/InvestmentOrDeposit",
      iris = Set("http://schema.org/InvestmentOrDeposit"),
      label = "InvestmentOrDeposit",
      comment =
        """A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.""",
      `@extends` = () => List(FinancialProduct.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.FinancialProduct.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.FinancialProduct.Properties {}
}
