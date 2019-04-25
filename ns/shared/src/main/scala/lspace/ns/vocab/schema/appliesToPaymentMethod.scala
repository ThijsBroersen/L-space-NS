package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object appliesToPaymentMethod
    extends PropertyDef(
      iri = "http://schema.org/appliesToPaymentMethod",
      iris = Set("http://schema.org/appliesToPaymentMethod"),
      label = "appliesToPaymentMethod",
      comment = """The payment method(s) to which the payment charge specification applies.""",
      `@extends` = () => List(),
      `@range` = () => List(PaymentMethod.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
