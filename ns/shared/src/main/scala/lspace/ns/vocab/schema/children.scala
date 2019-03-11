package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object children extends PropertyDef(
        iri = "https://schema.org/children",
        iris = Set("https://schema.org/children"),
        label = "children",
        comment = """A child of the person.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}