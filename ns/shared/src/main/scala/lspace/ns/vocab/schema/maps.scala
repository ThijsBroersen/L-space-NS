package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object maps extends PropertyDef(
        iri = "https://schema.org/maps",
        iris = Set("https://schema.org/maps"),
        label = "maps",
        comment = """A URL to a map of the place.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}