package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object map extends PropertyDef(
        iri = "https://schema.org/map",
        iris = Set("https://schema.org/map"),
        label = "map",
        comment = """A URL to a map of the place.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}