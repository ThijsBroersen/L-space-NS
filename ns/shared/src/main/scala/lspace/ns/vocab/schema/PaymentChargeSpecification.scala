package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaymentChargeSpecification extends OntologyDef(
        iri = "http://schema.org/PaymentChargeSpecification",
        iris = Set("http://schema.org/PaymentChargeSpecification"),
        label = "PaymentChargeSpecification",
        comment = """The costs of settling the payment using a particular payment method.""",
        `@extends` = () => List(PriceSpecification.ontology)
       ){
}