package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gtin14
    extends PropertyDef(
      iri = "http://schema.org/gtin14",
      iris = Set("http://schema.org/gtin14"),
      label = "gtin14",
      comment =
        """The GTIN-14 code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.""",
      `@extends` = () => List(identifier.property),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}
