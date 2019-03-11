package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object isAccessibleForFree extends PropertyDef(
        iri = "https://schema.org/isAccessibleForFree",
        iris = Set("https://schema.org/isAccessibleForFree"),
        label = "isAccessibleForFree",
        comment = """A flag to signal that the item, event, or place is accessible for free.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}