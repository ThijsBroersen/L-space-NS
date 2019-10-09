package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isAccessibleForFree extends PropertyDef(
        iri = "http://schema.org/isAccessibleForFree",
        iris = Set("http://schema.org/isAccessibleForFree"),
        label = "isAccessibleForFree",
        comment = """A flag to signal that the item, event, or place is accessible for free.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}