package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object genre extends PropertyDef(
        iri = "https://schema.org/genre",
        iris = Set("https://schema.org/genre"),
        label = "genre",
        comment = """Genre of the creative work, broadcast channel or group.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, `@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}