package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CurrencyConversionService extends OntologyDef(
        iri = "http://schema.org/CurrencyConversionService",
        iris = Set("http://schema.org/CurrencyConversionService"),
        label = "CurrencyConversionService",
        comment = """A service to convert funds from one currency to another currency.""",
        `@extends` = () => List(FinancialProduct.ontology)
       ){
}