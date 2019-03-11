package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object accessibilityHazard extends PropertyDef(
        iri = "https://schema.org/accessibilityHazard",
        iris = Set("https://schema.org/accessibilityHazard"),
        label = "accessibilityHazard",
        comment = """A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}