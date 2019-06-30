package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaymentCard extends OntologyDef(
        iri = "http://schema.org/PaymentCard",
        iris = Set("http://schema.org/PaymentCard"),
        label = "PaymentCard",
        comment = """A payment method using a credit, debit, store or other card to associate the payment with an account.""",
        `@extends` = () => List(FinancialProduct.ontology, PaymentMethod.ontology)
       ){
}