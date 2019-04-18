package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfLoanPayments extends PropertyDef(
        iri = "http://schema.org/numberOfLoanPayments",
        iris = Set("http://schema.org/numberOfLoanPayments"),
        label = "numberOfLoanPayments",
        comment = """The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}