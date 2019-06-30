package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accessibilityAPI extends PropertyDef(
        iri = "http://schema.org/accessibilityAPI",
        iris = Set("http://schema.org/accessibilityAPI"),
        label = "accessibilityAPI",
        comment = """Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}