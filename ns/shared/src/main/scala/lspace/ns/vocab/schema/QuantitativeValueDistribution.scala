package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QuantitativeValueDistribution
    extends OntologyDef(
      iri = "http://schema.org/QuantitativeValueDistribution",
      iris = Set("http://schema.org/QuantitativeValueDistribution"),
      label = "QuantitativeValueDistribution",
      comment = """A statistical distribution of values.""",
      `@extends` = () => List(StructuredValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val percentile75 = lspace.ns.vocab.schema.percentile75.property
    lazy val percentile90 = lspace.ns.vocab.schema.percentile90.property
    lazy val duration     = lspace.ns.vocab.schema.duration.property
  }
  override lazy val properties: List[LProperty] = List(percentile75, percentile90, duration)
  trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val percentile75 = lspace.ns.vocab.schema.percentile75.property
    lazy val percentile90 = lspace.ns.vocab.schema.percentile90.property
    lazy val duration     = lspace.ns.vocab.schema.duration.property
  }
}
