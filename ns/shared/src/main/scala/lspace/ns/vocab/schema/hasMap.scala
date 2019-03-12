package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object hasMap extends PropertyDef(
        iri = "https://schema.org/hasMap",
        iris = Set("https://schema.org/hasMap"),
        label = "hasMap",
        comment = """A URL to a map of the place.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}