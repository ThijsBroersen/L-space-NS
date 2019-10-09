package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object abridged extends PropertyDef(
        iri = "http://schema.org/abridged",
        iris = Set("http://schema.org/abridged"),
        label = "abridged",
        comment = """Indicates whether the book is an abridged edition.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}