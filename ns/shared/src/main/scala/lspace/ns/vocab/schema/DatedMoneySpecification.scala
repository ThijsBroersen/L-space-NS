package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DatedMoneySpecification extends OntologyDef(
        iri = "http://schema.org/DatedMoneySpecification",
        iris = Set("http://schema.org/DatedMoneySpecification"),
        label = "DatedMoneySpecification",
        comment = """A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. <strong>Note:</strong> This type has been superseded by <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> use of that type is recommended""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}