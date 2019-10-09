package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object alternateName extends PropertyDef(
        iri = "http://schema.org/alternateName",
        iris = Set("http://schema.org/alternateName"),
        label = "alternateName",
        comment = """An alias for the item.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}