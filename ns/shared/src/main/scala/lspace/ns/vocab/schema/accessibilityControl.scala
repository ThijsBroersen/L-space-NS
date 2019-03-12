package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object accessibilityControl extends PropertyDef(
        iri = "https://schema.org/accessibilityControl",
        iris = Set("https://schema.org/accessibilityControl"),
        label = "accessibilityControl",
        comment = """Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}