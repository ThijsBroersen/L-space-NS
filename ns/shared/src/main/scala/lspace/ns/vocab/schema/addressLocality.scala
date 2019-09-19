package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object addressLocality extends PropertyDef(
        iri = "http://schema.org/addressLocality",
        iris = Set("http://schema.org/addressLocality"),
        label = "addressLocality",
        comment = """The locality. For example, Mountain View.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}