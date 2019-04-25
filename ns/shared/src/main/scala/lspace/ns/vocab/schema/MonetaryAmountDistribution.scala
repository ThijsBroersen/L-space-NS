package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MonetaryAmountDistribution
    extends OntologyDef(
      iri = "http://schema.org/MonetaryAmountDistribution",
      iris = Set("http://schema.org/MonetaryAmountDistribution"),
      label = "MonetaryAmountDistribution",
      comment = """A statistical distribution of monetary amounts.""",
      `@extends` = () => List(QuantitativeValueDistribution.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.QuantitativeValueDistribution.Properties {
    lazy val currency = lspace.ns.vocab.schema.currency.property
  }
  override lazy val properties: List[LProperty] = List(currency)
  trait Properties extends lspace.ns.vocab.schema.QuantitativeValueDistribution.Properties {
    lazy val currency = lspace.ns.vocab.schema.currency.property
  }
}
