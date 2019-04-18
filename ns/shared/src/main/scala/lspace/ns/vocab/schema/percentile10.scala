package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object percentile10
    extends PropertyDef(
      iri = "http://schema.org/percentile10",
      iris = Set("http://schema.org/percentile10"),
      label = "percentile10",
      comment = """The 10th percentile value.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
