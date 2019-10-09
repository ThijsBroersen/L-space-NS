package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object additionalName extends PropertyDef(
        iri = "http://schema.org/additionalName",
        iris = Set("http://schema.org/additionalName"),
        label = "additionalName",
        comment = """An additional name for a Person, can be used for a middle name.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}