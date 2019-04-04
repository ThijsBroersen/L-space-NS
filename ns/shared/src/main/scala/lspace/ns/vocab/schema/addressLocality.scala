package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object addressLocality extends PropertyDef(
        iri = "https://schema.org/addressLocality",
        iris = Set("https://schema.org/addressLocality"),
        label = "addressLocality",
        comment = """The locality. For example, Mountain View.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}