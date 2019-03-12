package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object thumbnailUrl extends PropertyDef(
        iri = "https://schema.org/thumbnailUrl",
        iris = Set("https://schema.org/thumbnailUrl"),
        label = "thumbnailUrl",
        comment = """A thumbnail image relevant to the Thing.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}