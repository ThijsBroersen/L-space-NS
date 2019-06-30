package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object nerveMotor extends PropertyDef(
        iri = "http://schema.org/nerveMotor",
        iris = Set("http://schema.org/nerveMotor"),
        label = "nerveMotor",
        comment = """The neurological pathway extension that involves muscle control.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}