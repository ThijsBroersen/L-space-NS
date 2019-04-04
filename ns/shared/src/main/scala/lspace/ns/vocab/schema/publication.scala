package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object publication extends PropertyDef(
        iri = "https://schema.org/publication",
        iris = Set("https://schema.org/publication"),
        label = "publication",
        comment = """A publication event associated with the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}