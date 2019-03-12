package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object isBasedOn extends PropertyDef(
        iri = "https://schema.org/isBasedOn",
        iris = Set("https://schema.org/isBasedOn"),
        label = "isBasedOn",
        comment = """A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork, `@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}