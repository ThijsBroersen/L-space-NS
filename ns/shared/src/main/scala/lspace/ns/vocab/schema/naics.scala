package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object naics extends PropertyDef(
        iri = "https://schema.org/naics",
        iris = Set("https://schema.org/naics"),
        label = "naics",
        comment = """The North American Industry Classification System (NAICS) code for a particular organization or business person.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}