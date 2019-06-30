package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InvestmentOrDeposit extends OntologyDef(
        iri = "http://schema.org/InvestmentOrDeposit",
        iris = Set("http://schema.org/InvestmentOrDeposit"),
        label = "InvestmentOrDeposit",
        comment = """A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.""",
        `@extends` = () => List(FinancialProduct.ontology)
       ){
}