package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object priceRange
    extends PropertyDef(
      iri = "http://schema.org/priceRange",
      iris = Set("http://schema.org/priceRange"),
      label = "priceRange",
      comment = """The price range of the business, for example <code>$$$</code>.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
