package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QuantitativeValueDistribution extends OntologyDef(
        iri = "http://schema.org/QuantitativeValueDistribution",
        iris = Set("http://schema.org/QuantitativeValueDistribution"),
        label = "QuantitativeValueDistribution",
        comment = """A statistical distribution of values.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val median = lspace.ns.vocab.schema.median.property
lazy val percentile10 = lspace.ns.vocab.schema.percentile10.property
lazy val percentile25 = lspace.ns.vocab.schema.percentile25.property
lazy val percentile75 = lspace.ns.vocab.schema.percentile75.property
lazy val percentile90 = lspace.ns.vocab.schema.percentile90.property
}
override lazy val properties: List[LProperty] = List(duration, median, percentile10, percentile25, percentile75, percentile90)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val median = lspace.ns.vocab.schema.median.property
lazy val percentile10 = lspace.ns.vocab.schema.percentile10.property
lazy val percentile25 = lspace.ns.vocab.schema.percentile25.property
lazy val percentile75 = lspace.ns.vocab.schema.percentile75.property
lazy val percentile90 = lspace.ns.vocab.schema.percentile90.property
}
}