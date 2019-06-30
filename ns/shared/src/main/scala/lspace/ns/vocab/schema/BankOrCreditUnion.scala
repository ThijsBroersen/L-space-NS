package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BankOrCreditUnion extends OntologyDef(
        iri = "http://schema.org/BankOrCreditUnion",
        iris = Set("http://schema.org/BankOrCreditUnion"),
        label = "BankOrCreditUnion",
        comment = """Bank or credit union.""",
        `@extends` = () => List(FinancialService.ontology)
       ){
}