package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object paymentMethod extends PropertyDef(
        iri = "http://schema.org/paymentMethod",
        iris = Set("http://schema.org/paymentMethod"),
        label = "paymentMethod",
        comment = """The name of the credit card or other method of payment for the order.""",
        `@extends` = () => List(),
        `@range` = () => List(PaymentMethod.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}