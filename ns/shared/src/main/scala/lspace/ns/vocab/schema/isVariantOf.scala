package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object isVariantOf
    extends PropertyDef(
      iri = "http://schema.org/isVariantOf",
      iris = Set("http://schema.org/isVariantOf"),
      label = "isVariantOf",
      comment =
        """A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.""",
      `@extends` = () => List(),
      `@range` = () => List(ProductModel.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
