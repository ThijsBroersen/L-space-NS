package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object lowPrice
    extends PropertyDef(
      iri = "http://schema.org/lowPrice",
      iris = Set("http://schema.org/lowPrice"),
      label = "lowPrice",
      comment = """The lowest price of all offers available.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
