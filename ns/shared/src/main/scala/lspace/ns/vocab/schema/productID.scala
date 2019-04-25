package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object productID
    extends PropertyDef(
      iri = "http://schema.org/productID",
      iris = Set("http://schema.org/productID"),
      label = "productID",
      comment =
        """The product identifier, such as ISBN. For example: <code>meta itemprop="productID" content="isbn:123-456-789"</code>.""",
      `@extends` = () => List(identifier.property),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}
