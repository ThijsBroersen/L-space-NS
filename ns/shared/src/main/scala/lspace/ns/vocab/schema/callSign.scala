package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object callSign extends PropertyDef(
        iri = "http://schema.org/callSign",
        iris = Set("http://schema.org/callSign"),
        label = "callSign",
        comment = """The official callsign for the radio broadcast.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}