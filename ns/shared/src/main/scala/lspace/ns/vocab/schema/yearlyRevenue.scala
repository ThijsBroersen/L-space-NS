package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object yearlyRevenue
    extends PropertyDef(
      iri = "http://schema.org/yearlyRevenue",
      iris = Set("http://schema.org/yearlyRevenue"),
      label = "yearlyRevenue",
      comment = """The size of the business in annual revenue.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
