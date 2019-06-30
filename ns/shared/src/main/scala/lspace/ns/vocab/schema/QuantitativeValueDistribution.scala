package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QuantitativeValueDistribution extends OntologyDef(
        iri = "http://schema.org/QuantitativeValueDistribution",
        iris = Set("http://schema.org/QuantitativeValueDistribution"),
        label = "QuantitativeValueDistribution",
        comment = """A statistical distribution of values.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}