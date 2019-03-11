package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object colleague extends PropertyDef(
        iri = "https://schema.org/colleague",
        iris = Set("https://schema.org/colleague"),
        label = "colleague",
        comment = """A colleague of the person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}