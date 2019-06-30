package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object openingHoursSpecification extends PropertyDef(
        iri = "http://schema.org/openingHoursSpecification",
        iris = Set("http://schema.org/openingHoursSpecification"),
        label = "openingHoursSpecification",
        comment = """The opening hours of a certain place.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}