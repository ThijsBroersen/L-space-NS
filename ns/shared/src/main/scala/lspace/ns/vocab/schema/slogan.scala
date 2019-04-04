package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object slogan extends PropertyDef(
        iri = "https://schema.org/slogan",
        iris = Set("https://schema.org/slogan"),
        label = "slogan",
        comment = """A slogan or motto associated with the item.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}