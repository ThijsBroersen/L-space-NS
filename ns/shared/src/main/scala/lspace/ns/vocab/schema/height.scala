package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object height extends PropertyDef(
        iri = "https://schema.org/height",
        iris = Set("https://schema.org/height"),
        label = "height",
        comment = """The height of the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}