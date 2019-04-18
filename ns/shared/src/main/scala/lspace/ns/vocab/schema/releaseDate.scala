package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object releaseDate extends PropertyDef(
        iri = "http://schema.org/releaseDate",
        iris = Set("http://schema.org/releaseDate"),
        label = "releaseDate",
        comment = """The release date of a product or product model. This can be used to distinguish the exact variant of a product.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}