package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gtin12 extends PropertyDef(
        iri = "http://schema.org/gtin12",
        iris = Set("http://schema.org/gtin12"),
        label = "gtin12",
        comment = """The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.""",
        `@extends` = () => List(identifier.property),
        `@range` = () => List(Text.ontology)
       ){
}