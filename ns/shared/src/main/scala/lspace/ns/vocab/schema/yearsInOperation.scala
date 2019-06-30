package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object yearsInOperation extends PropertyDef(
        iri = "http://schema.org/yearsInOperation",
        iris = Set("http://schema.org/yearsInOperation"),
        label = "yearsInOperation",
        comment = """The age of the business.""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology)
       ){
}