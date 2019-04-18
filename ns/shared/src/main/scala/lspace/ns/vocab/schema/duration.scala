package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object duration extends PropertyDef(
        iri = "http://schema.org/duration",
        iris = Set("http://schema.org/duration"),
        label = "duration",
        comment = """The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Duration.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}