package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExchangeRateSpecification extends OntologyDef(
        iri = "http://schema.org/ExchangeRateSpecification",
        iris = Set("http://schema.org/ExchangeRateSpecification"),
        label = "ExchangeRateSpecification",
        comment = """A structured value representing exchange rate.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val currency = lspace.ns.vocab.schema.currency.property
lazy val currentExchangeRate = lspace.ns.vocab.schema.currentExchangeRate.property
lazy val exchangeRateSpread = lspace.ns.vocab.schema.exchangeRateSpread.property
}
override lazy val properties: List[LProperty] = List(currency, currentExchangeRate, exchangeRateSpread)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val currency = lspace.ns.vocab.schema.currency.property
lazy val currentExchangeRate = lspace.ns.vocab.schema.currentExchangeRate.property
lazy val exchangeRateSpread = lspace.ns.vocab.schema.exchangeRateSpread.property
}
}