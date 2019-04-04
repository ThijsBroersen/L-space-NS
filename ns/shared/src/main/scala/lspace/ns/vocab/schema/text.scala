package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object text extends PropertyDef(
        iri = "https://schema.org/text",
        iris = Set("https://schema.org/text"),
        label = "text",
        comment = """The textual content of this CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}