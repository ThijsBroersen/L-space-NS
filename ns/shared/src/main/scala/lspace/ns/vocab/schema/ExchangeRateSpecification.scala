package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExchangeRateSpecification extends OntologyDef(
        iri = "http://schema.org/ExchangeRateSpecification",
        iris = Set("http://schema.org/ExchangeRateSpecification"),
        label = "ExchangeRateSpecification",
        comment = """A structured value representing exchange rate.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}