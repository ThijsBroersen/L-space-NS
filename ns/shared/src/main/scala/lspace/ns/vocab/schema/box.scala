package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object box extends PropertyDef(
        iri = "http://schema.org/box",
        iris = Set("http://schema.org/box"),
        label = "box",
        comment = """A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}