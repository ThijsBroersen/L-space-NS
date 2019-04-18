package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recordingOf extends PropertyDef(
        iri = "http://schema.org/recordingOf",
        iris = Set("http://schema.org/recordingOf"),
        label = "recordingOf",
        comment = """The composition this track is a recording of.""",
        `@extends` = () => List(),
        `@range` = () => List(MusicComposition.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}