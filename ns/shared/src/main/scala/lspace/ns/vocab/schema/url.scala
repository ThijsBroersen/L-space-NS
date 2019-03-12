package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object url extends PropertyDef(
        iri = "https://schema.org/url",
        iris = Set("https://schema.org/url"),
        label = "url",
        comment = """URL of the item.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}