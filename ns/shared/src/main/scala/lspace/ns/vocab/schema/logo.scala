package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object logo extends PropertyDef(
        iri = "https://schema.org/logo",
        iris = Set("https://schema.org/logo"),
        label = "logo",
        comment = """An associated logo.""",
        `@extends` = () => List(image.property),
        `@range` = () => List(`@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.image.Properties
}