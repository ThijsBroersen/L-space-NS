package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object purchaseDate extends PropertyDef(
        iri = "http://schema.org/purchaseDate",
        iris = Set("http://schema.org/purchaseDate"),
        label = "purchaseDate",
        comment = """The date the item e.g. vehicle was purchased by the current owner.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){
}