package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object scheduledPaymentDate extends PropertyDef(
        iri = "http://schema.org/scheduledPaymentDate",
        iris = Set("http://schema.org/scheduledPaymentDate"),
        label = "scheduledPaymentDate",
        comment = """The date the invoice is scheduled to be paid.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){
}