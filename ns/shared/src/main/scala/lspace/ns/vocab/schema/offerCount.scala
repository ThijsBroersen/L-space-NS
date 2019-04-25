package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object offerCount
    extends PropertyDef(
      iri = "http://schema.org/offerCount",
      iris = Set("http://schema.org/offerCount"),
      label = "offerCount",
      comment = """The number of offers for the product.""",
      `@extends` = () => List(),
      `@range` = () => List(Integer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
