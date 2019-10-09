package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DatedMoneySpecification extends OntologyDef(
        iri = "http://schema.org/DatedMoneySpecification",
        iris = Set("http://schema.org/DatedMoneySpecification"),
        label = "DatedMoneySpecification",
        comment = """A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. <strong>Note:</strong> This type has been superseded by <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> use of that type is recommended""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val amount = lspace.ns.vocab.schema.amount.property
lazy val currency = lspace.ns.vocab.schema.currency.property
lazy val endDate = lspace.ns.vocab.schema.endDate.property
lazy val startDate = lspace.ns.vocab.schema.startDate.property
}
override lazy val properties: List[LProperty] = List(amount, currency, endDate, startDate)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val amount = lspace.ns.vocab.schema.amount.property
lazy val currency = lspace.ns.vocab.schema.currency.property
lazy val endDate = lspace.ns.vocab.schema.endDate.property
lazy val startDate = lspace.ns.vocab.schema.startDate.property
}
}