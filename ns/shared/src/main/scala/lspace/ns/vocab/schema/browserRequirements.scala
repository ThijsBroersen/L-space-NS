package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object browserRequirements extends PropertyDef(
        iri = "http://schema.org/browserRequirements",
        iris = Set("http://schema.org/browserRequirements"),
        label = "browserRequirements",
        comment = """Specifies browser requirements in human-readable text. For example, 'requires HTML5 support'.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}