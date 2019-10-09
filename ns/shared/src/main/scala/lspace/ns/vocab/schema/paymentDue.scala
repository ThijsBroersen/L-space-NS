package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object paymentDue extends PropertyDef(
        iri = "http://schema.org/paymentDue",
        iris = Set("http://schema.org/paymentDue"),
        label = "paymentDue",
        comment = """The date that payment is due.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}