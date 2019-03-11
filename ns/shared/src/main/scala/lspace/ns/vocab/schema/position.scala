package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object position extends PropertyDef(
        iri = "https://schema.org/position",
        iris = Set("https://schema.org/position"),
        label = "position",
        comment = """The position of an item in a series or sequence of items.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}