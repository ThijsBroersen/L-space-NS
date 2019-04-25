package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaymentChargeSpecification
    extends OntologyDef(
      iri = "http://schema.org/PaymentChargeSpecification",
      iris = Set("http://schema.org/PaymentChargeSpecification"),
      label = "PaymentChargeSpecification",
      comment = """The costs of settling the payment using a particular payment method.""",
      `@extends` = () => List(PriceSpecification.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PriceSpecification.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.PriceSpecification.Properties {}
}
