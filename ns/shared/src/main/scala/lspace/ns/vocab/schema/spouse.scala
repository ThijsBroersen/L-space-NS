package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object spouse extends PropertyDef(
        iri = "https://schema.org/spouse",
        iris = Set("https://schema.org/spouse"),
        label = "spouse",
        comment = """The person's spouse.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}