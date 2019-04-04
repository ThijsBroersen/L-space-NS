package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object contactOption extends PropertyDef(
        iri = "https://schema.org/contactOption",
        iris = Set("https://schema.org/contactOption"),
        label = "contactOption",
        comment = """An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}