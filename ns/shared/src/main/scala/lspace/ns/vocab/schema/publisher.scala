package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object publisher extends PropertyDef(
        iri = "https://schema.org/publisher",
        iris = Set("https://schema.org/publisher"),
        label = "publisher",
        comment = """The publisher of the creative work.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}