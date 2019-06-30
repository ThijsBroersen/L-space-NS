package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MonetaryAmountDistribution extends OntologyDef(
        iri = "http://schema.org/MonetaryAmountDistribution",
        iris = Set("http://schema.org/MonetaryAmountDistribution"),
        label = "MonetaryAmountDistribution",
        comment = """A statistical distribution of monetary amounts.""",
        `@extends` = () => List(QuantitativeValueDistribution.ontology)
       ){
}