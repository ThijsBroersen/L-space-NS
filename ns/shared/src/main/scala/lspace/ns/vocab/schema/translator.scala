package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object translator extends PropertyDef(
        iri = "http://schema.org/translator",
        iris = Set("http://schema.org/translator"),
        label = "translator",
        comment = """Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}