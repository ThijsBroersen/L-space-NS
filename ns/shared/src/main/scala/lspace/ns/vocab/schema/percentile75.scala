package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object percentile75
    extends PropertyDef(
      iri = "http://schema.org/percentile75",
      iris = Set("http://schema.org/percentile75"),
      label = "percentile75",
      comment = """The 75th percentile value.""",
      `@extends` = () => List(),
      `@range` = () => List(`@number`, Number.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
