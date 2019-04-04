package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object photo extends PropertyDef(
        iri = "https://schema.org/photo",
        iris = Set("https://schema.org/photo"),
        label = "photo",
        comment = """A photograph of this place.""",
        `@extends` = () => List(image.property),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.image.Properties
}