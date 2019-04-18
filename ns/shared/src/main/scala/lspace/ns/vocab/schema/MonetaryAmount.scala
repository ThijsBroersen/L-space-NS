package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MonetaryAmount extends OntologyDef(
        iri = "http://schema.org/MonetaryAmount",
        iris = Set("http://schema.org/MonetaryAmount"),
        label = "MonetaryAmount",
        comment = """A monetary value or range. This type can be used to describe an amount of money such as $50 USD, or a range as in describing a bank account being suitable for a balance between £1,000 and £1,000,000 GBP, or the value of a salary, etc. It is recommended to use <a class="localLink" href="http://schema.org/PriceSpecification">PriceSpecification</a> Types to describe the price of an Offer, Invoice, etc.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val currency = lspace.ns.vocab.schema.currency.property
}
override lazy val properties: List[LProperty] = List(minValue, currency)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val currency = lspace.ns.vocab.schema.currency.property
}
}