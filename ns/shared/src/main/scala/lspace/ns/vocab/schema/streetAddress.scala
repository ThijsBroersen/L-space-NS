package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object streetAddress extends PropertyDef(
        iri = "https://schema.org/streetAddress",
        iris = Set("https://schema.org/streetAddress"),
        label = "streetAddress",
        comment = """The street address. For example, 1600 Amphitheatre Pkwy.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}