package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object paymentStatus extends PropertyDef(
        iri = "http://schema.org/paymentStatus",
        iris = Set("http://schema.org/paymentStatus"),
        label = "paymentStatus",
        comment = """The status of payment; whether the invoice has been paid or not.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}