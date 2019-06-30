package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accessibilityFeature extends PropertyDef(
        iri = "http://schema.org/accessibilityFeature",
        iris = Set("http://schema.org/accessibilityFeature"),
        label = "accessibilityFeature",
        comment = """Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}