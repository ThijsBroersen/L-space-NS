package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object character extends PropertyDef(
        iri = "https://schema.org/character",
        iris = Set("https://schema.org/character"),
        label = "character",
        comment = """Fictional person connected with a creative work.""",
        `@extends` = () => List(),
        `@range` = () => List(Person)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}