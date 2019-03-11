package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object name extends PropertyDef(
        iri = "https://schema.org/name",
        iris = Set("https://schema.org/name"),
        label = "name",
        comment = """The name of the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}