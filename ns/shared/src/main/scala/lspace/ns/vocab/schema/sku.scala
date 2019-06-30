package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sku extends PropertyDef(
        iri = "http://schema.org/sku",
        iris = Set("http://schema.org/sku"),
        label = "sku",
        comment = """The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.""",
        `@extends` = () => List(identifier.property),
        `@range` = () => List(Text.ontology)
       ){
}