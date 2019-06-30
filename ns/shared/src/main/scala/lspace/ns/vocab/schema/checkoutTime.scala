package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object checkoutTime extends PropertyDef(
        iri = "http://schema.org/checkoutTime",
        iris = Set("http://schema.org/checkoutTime"),
        label = "checkoutTime",
        comment = """The latest someone may check out of a lodging establishment.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){
}