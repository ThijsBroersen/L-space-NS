package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object brand extends PropertyDef(
        iri = "https://schema.org/brand",
        iris = Set("https://schema.org/brand"),
        label = "brand",
        comment = """The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}