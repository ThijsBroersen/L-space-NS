package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object `yield`
    extends PropertyDef(
      iri = "http://schema.org/yield",
      iris = Set("http://schema.org/yield"),
      label = "yield",
      comment =
        """The quantity that results by performing instructions. For example, a paper airplane, 10 personalized candles.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, QuantitativeValue.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
