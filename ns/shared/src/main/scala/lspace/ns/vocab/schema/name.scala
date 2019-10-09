package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object name extends PropertyDef(
        iri = "http://schema.org/name",
        iris = Set("http://schema.org/name"),
        label = "name",
        comment = """The name of the item.""",
        `@extends` = List(`@label`),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}