package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object paymentDueDate extends PropertyDef(
        iri = "http://schema.org/paymentDueDate",
        iris = Set("http://schema.org/paymentDueDate"),
        label = "paymentDueDate",
        comment = """The date that payment is due.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){
}