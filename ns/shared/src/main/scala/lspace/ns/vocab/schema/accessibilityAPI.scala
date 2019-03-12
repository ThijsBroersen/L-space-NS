package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object accessibilityAPI extends PropertyDef(
        iri = "https://schema.org/accessibilityAPI",
        iris = Set("https://schema.org/accessibilityAPI"),
        label = "accessibilityAPI",
        comment = """Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}