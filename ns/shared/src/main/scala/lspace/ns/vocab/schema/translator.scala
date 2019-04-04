package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object translator extends PropertyDef(
        iri = "https://schema.org/translator",
        iris = Set("https://schema.org/translator"),
        label = "translator",
        comment = """Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}