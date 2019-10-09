package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object interestRate extends PropertyDef(
        iri = "http://schema.org/interestRate",
        iris = Set("http://schema.org/interestRate"),
        label = "interestRate",
        comment = """The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology, `@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}