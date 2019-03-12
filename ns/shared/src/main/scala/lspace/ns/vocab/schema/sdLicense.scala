package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object sdLicense extends PropertyDef(
        iri = "https://schema.org/sdLicense",
        iris = Set("https://schema.org/sdLicense"),
        label = "sdLicense",
        comment = """A license document that applies to this structured data, typically indicated by URL.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork, `@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}