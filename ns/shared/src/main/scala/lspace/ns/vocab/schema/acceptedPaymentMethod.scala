package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object acceptedPaymentMethod
    extends PropertyDef(
      iri = "http://schema.org/acceptedPaymentMethod",
      iris = Set("http://schema.org/acceptedPaymentMethod"),
      label = "acceptedPaymentMethod",
      comment = """The payment method(s) accepted by seller for this offer.""",
      `@extends` = () => List(),
      `@range` = () => List(LoanOrCredit.ontology, PaymentMethod.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
