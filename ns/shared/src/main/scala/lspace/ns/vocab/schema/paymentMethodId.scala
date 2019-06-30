package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object paymentMethodId extends PropertyDef(
        iri = "http://schema.org/paymentMethodId",
        iris = Set("http://schema.org/paymentMethodId"),
        label = "paymentMethodId",
        comment = """An identifier for the method of payment used (e.g. the last 4 digits of the credit card).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}