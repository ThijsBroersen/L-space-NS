package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object contributor extends PropertyDef(
        iri = "https://schema.org/contributor",
        iris = Set("https://schema.org/contributor"),
        label = "contributor",
        comment = """A secondary contributor to the CreativeWork or Event.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}