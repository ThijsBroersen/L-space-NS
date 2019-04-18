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

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Service.Properties{

}
}