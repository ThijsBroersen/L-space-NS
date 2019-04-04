package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object alternateName extends PropertyDef(
        iri = "https://schema.org/alternateName",
        iris = Set("https://schema.org/alternateName"),
        label = "alternateName",
        comment = """An alias for the item.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}