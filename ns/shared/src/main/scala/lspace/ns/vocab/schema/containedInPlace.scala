package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object containedInPlace extends PropertyDef(
        iri = "https://schema.org/containedInPlace",
        iris = Set("https://schema.org/containedInPlace"),
        label = "containedInPlace",
        comment = """The basic containment relation between a place and one that contains it.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}