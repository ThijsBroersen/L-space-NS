package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object parent extends PropertyDef(
        iri = "https://schema.org/parent",
        iris = Set("https://schema.org/parent"),
        label = "parent",
        comment = """A parent of this person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}