package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object model extends PropertyDef(
        iri = "http://schema.org/model",
        iris = Set("http://schema.org/model"),
        label = "model",
        comment = """The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, ProductModel.ontology)
       ){
}