package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object highPrice
    extends PropertyDef(
      iri = "http://schema.org/highPrice",
      iris = Set("http://schema.org/highPrice"),
      label = "highPrice",
      comment = """The highest price of all offers available.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
