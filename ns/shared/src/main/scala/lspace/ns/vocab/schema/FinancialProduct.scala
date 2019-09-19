package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FinancialProduct extends OntologyDef(
        iri = "http://schema.org/FinancialProduct",
        iris = Set("http://schema.org/FinancialProduct"),
        label = "FinancialProduct",
        comment = """A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.""",
        `@extends` = () => List(Service.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Service.Properties{
lazy val annualPercentageRate = lspace.ns.vocab.schema.annualPercentageRate.property
lazy val feesAndCommissionsSpecification = lspace.ns.vocab.schema.feesAndCommissionsSpecification.property
lazy val interestRate = lspace.ns.vocab.schema.interestRate.property
}
override lazy val properties: List[LProperty] = List(annualPercentageRate, feesAndCommissionsSpecification, interestRate)
trait Properties extends lspace.ns.vocab.schema.Service.Properties{
lazy val annualPercentageRate = lspace.ns.vocab.schema.annualPercentageRate.property
lazy val feesAndCommissionsSpecification = lspace.ns.vocab.schema.feesAndCommissionsSpecification.property
lazy val interestRate = lspace.ns.vocab.schema.interestRate.property
}
}