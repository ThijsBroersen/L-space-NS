package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object text extends PropertyDef(
        iri = "http://schema.org/text",
        iris = Set("http://schema.org/text"),
        label = "text",
        comment = """The textual content of this CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}