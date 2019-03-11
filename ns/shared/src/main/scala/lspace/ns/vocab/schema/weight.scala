package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object weight extends PropertyDef(
        iri = "https://schema.org/weight",
        iris = Set("https://schema.org/weight"),
        label = "weight",
        comment = """The weight of the product or person.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}