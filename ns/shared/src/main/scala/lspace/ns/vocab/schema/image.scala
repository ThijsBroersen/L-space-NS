package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object image extends PropertyDef(
        iri = "https://schema.org/image",
        iris = Set("https://schema.org/image"),
        label = "image",
        comment = """An image of the item. This can be a <a class="localLink" href="http://schema.org/URL">URL</a> or a fully described <a class="localLink" href="http://schema.org/ImageObject">ImageObject</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}