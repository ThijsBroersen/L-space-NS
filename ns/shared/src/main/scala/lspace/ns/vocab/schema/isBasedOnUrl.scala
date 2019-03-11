package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object isBasedOnUrl extends PropertyDef(
        iri = "https://schema.org/isBasedOnUrl",
        iris = Set("https://schema.org/isBasedOnUrl"),
        label = "isBasedOnUrl",
        comment = """A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}