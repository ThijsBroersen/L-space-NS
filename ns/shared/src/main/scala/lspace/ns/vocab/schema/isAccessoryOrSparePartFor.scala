package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object isAccessoryOrSparePartFor
    extends PropertyDef(
      iri = "http://schema.org/isAccessoryOrSparePartFor",
      iris = Set("http://schema.org/isAccessoryOrSparePartFor"),
      label = "isAccessoryOrSparePartFor",
      comment =
        """A pointer to another product (or multiple products) for which this product is an accessory or spare part.""",
      `@extends` = () => List(),
      `@range` = () => List(Product.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
