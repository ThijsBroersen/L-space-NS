package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object loanPaymentAmount extends PropertyDef(
        iri = "http://schema.org/loanPaymentAmount",
        iris = Set("http://schema.org/loanPaymentAmount"),
        label = "loanPaymentAmount",
        comment = """The amount of money to pay in a single payment.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}