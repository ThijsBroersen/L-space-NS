package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object isConsumableFor
    extends PropertyDef(
      iri = "http://schema.org/isConsumableFor",
      iris = Set("http://schema.org/isConsumableFor"),
      label = "isConsumableFor",
      comment = """A pointer to another product (or multiple products) for which this product is a consumable.""",
      `@extends` = () => List(),
      `@range` = () => List(Product.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
