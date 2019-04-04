package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object awards extends PropertyDef(
        iri = "https://schema.org/awards",
        iris = Set("https://schema.org/awards"),
        label = "awards",
        comment = """Awards won by or for this item.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}