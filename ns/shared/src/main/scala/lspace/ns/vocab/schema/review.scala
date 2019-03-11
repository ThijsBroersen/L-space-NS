package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object review extends PropertyDef(
        iri = "https://schema.org/review",
        iris = Set("https://schema.org/review"),
        label = "review",
        comment = """A review of the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}