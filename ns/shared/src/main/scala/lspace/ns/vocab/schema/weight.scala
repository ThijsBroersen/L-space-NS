package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object weight
    extends PropertyDef(
      iri = "http://schema.org/weight",
      iris = Set("http://schema.org/weight"),
      label = "weight",
      comment = """The weight of the product or person.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
