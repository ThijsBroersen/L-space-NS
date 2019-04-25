package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BankAccount
    extends OntologyDef(
      iri = "http://schema.org/BankAccount",
      iris = Set("http://schema.org/BankAccount"),
      label = "BankAccount",
      comment =
        """A product or service offered by a bank whereby one may deposit, withdraw or transfer money and in some cases be paid interest.""",
      `@extends` = () => List(FinancialProduct.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.FinancialProduct.Properties {
    lazy val accountMinimumInflow = lspace.ns.vocab.schema.accountMinimumInflow.property
    lazy val bankAccountType      = lspace.ns.vocab.schema.bankAccountType.property
  }
  override lazy val properties: List[LProperty] = List(accountMinimumInflow, bankAccountType)
  trait Properties extends lspace.ns.vocab.schema.FinancialProduct.Properties {
    lazy val accountMinimumInflow = lspace.ns.vocab.schema.accountMinimumInflow.property
    lazy val bankAccountType      = lspace.ns.vocab.schema.bankAccountType.property
  }
}
