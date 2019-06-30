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
}