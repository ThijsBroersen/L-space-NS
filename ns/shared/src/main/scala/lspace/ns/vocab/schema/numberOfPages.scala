package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfPages extends PropertyDef(
        iri = "http://schema.org/numberOfPages",
        iris = Set("http://schema.org/numberOfPages"),
        label = "numberOfPages",
        comment = """The number of pages in the book.""",
        `@extends` = () => List(),
        `@range` = () => List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}