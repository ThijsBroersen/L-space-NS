package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object awards extends PropertyDef(
        iri = "http://schema.org/awards",
        iris = Set("http://schema.org/awards"),
        label = "awards",
        comment = """Awards won by or for this item.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}