package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object reviews extends PropertyDef(
        iri = "https://schema.org/reviews",
        iris = Set("https://schema.org/reviews"),
        label = "reviews",
        comment = """Review of the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}