package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object closes extends PropertyDef(
        iri = "http://schema.org/closes",
        iris = Set("http://schema.org/closes"),
        label = "closes",
        comment = """The closing hour of the place or service on the given day(s) of the week.""",
        `@extends` = () => List(),
        `@range` = () => List(`@time`)
       ){
}