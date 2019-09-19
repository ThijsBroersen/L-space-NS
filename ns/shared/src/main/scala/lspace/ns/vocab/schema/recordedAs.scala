package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recordedAs extends PropertyDef(
        iri = "http://schema.org/recordedAs",
        iris = Set("http://schema.org/recordedAs"),
        label = "recordedAs",
        comment = """An audio recording of the work.""",
        `@extends` = () => List(),
        `@range` = () => List(MusicRecording.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}