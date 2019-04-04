package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object photos extends PropertyDef(
        iri = "https://schema.org/photos",
        iris = Set("https://schema.org/photos"),
        label = "photos",
        comment = """Photographs of this place.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}