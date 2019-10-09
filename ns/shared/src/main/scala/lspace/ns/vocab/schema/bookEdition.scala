package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bookEdition extends PropertyDef(
        iri = "http://schema.org/bookEdition",
        iris = Set("http://schema.org/bookEdition"),
        label = "bookEdition",
        comment = """The edition of the book.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}