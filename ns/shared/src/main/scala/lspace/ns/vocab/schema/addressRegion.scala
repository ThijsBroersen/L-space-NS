package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object addressRegion extends PropertyDef(
        iri = "http://schema.org/addressRegion",
        iris = Set("http://schema.org/addressRegion"),
        label = "addressRegion",
        comment = """The region. For example, CA.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}