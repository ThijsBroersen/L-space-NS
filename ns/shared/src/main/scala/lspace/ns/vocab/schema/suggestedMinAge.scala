package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object suggestedMinAge extends PropertyDef(
        iri = "http://schema.org/suggestedMinAge",
        iris = Set("http://schema.org/suggestedMinAge"),
        label = "suggestedMinAge",
        comment = """Minimal age recommended for viewing content.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}