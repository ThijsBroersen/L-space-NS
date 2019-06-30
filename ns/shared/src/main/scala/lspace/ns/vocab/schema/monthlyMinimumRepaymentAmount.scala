package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object monthlyMinimumRepaymentAmount extends PropertyDef(
        iri = "http://schema.org/monthlyMinimumRepaymentAmount",
        iris = Set("http://schema.org/monthlyMinimumRepaymentAmount"),
        label = "monthlyMinimumRepaymentAmount",
        comment = """The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology, MonetaryAmount.ontology)
       ){
}