package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object containsPlace extends PropertyDef(
        iri = "https://schema.org/containsPlace",
        iris = Set("https://schema.org/containsPlace"),
        label = "containsPlace",
        comment = """The basic containment relation between a place and another that it contains.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}