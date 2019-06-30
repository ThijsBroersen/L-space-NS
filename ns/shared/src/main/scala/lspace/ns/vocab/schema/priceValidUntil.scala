package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object priceValidUntil extends PropertyDef(
        iri = "http://schema.org/priceValidUntil",
        iris = Set("http://schema.org/priceValidUntil"),
        label = "priceValidUntil",
        comment = """The date after which the price is no longer available.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){
}