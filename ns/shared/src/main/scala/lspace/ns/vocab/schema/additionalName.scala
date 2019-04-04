package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object additionalName extends PropertyDef(
        iri = "https://schema.org/additionalName",
        iris = Set("https://schema.org/additionalName"),
        label = "additionalName",
        comment = """An additional name for a Person, can be used for a middle name.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}