package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object mpn extends PropertyDef(
        iri = "http://schema.org/mpn",
        iris = Set("http://schema.org/mpn"),
        label = "mpn",
        comment = """The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}