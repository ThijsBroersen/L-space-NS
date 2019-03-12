package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object addressRegion extends PropertyDef(
        iri = "https://schema.org/addressRegion",
        iris = Set("https://schema.org/addressRegion"),
        label = "addressRegion",
        comment = """The region. For example, CA.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}