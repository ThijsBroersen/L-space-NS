package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object productSupported
    extends PropertyDef(
      iri = "http://schema.org/productSupported",
      iris = Set("http://schema.org/productSupported"),
      label = "productSupported",
      comment =
        """The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, Product.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
