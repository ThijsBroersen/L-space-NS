package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DepositAccount extends OntologyDef(
        iri = "http://schema.org/DepositAccount",
        iris = Set("http://schema.org/DepositAccount"),
        label = "DepositAccount",
        comment = """A type of Bank Account with a main purpose of depositing funds to gain interest or other benefits.""",
        `@extends` = () => List(InvestmentOrDeposit.ontology, BankAccount.ontology)
       ){
}