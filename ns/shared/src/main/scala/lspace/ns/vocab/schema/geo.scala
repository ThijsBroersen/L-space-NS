package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object geo extends PropertyDef(
        iri = "https://schema.org/geo",
        iris = Set("https://schema.org/geo"),
        label = "geo",
        comment = """The geo coordinates of the place.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}