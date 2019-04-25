package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaymentCard
    extends OntologyDef(
      iri = "http://schema.org/PaymentCard",
      iris = Set("http://schema.org/PaymentCard"),
      label = "PaymentCard",
      comment =
        """A payment method using a credit, debit, store or other card to associate the payment with an account.""",
      `@extends` = () => List(FinancialProduct.ontology, PaymentMethod.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.FinancialProduct.Properties
      with lspace.ns.vocab.schema.PaymentMethod.Properties {
    lazy val cashBack           = lspace.ns.vocab.schema.cashBack.property
    lazy val contactlessPayment = lspace.ns.vocab.schema.contactlessPayment.property
    lazy val floorLimit         = lspace.ns.vocab.schema.floorLimit.property
  }
  override lazy val properties: List[LProperty] = List(cashBack, contactlessPayment, floorLimit)
  trait Properties
      extends lspace.ns.vocab.schema.FinancialProduct.Properties
      with lspace.ns.vocab.schema.PaymentMethod.Properties {
    lazy val cashBack           = lspace.ns.vocab.schema.cashBack.property
    lazy val contactlessPayment = lspace.ns.vocab.schema.contactlessPayment.property
    lazy val floorLimit         = lspace.ns.vocab.schema.floorLimit.property
  }
}
