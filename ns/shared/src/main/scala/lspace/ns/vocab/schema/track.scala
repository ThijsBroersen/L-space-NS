package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object track extends PropertyDef(
        iri = "http://schema.org/track",
        iris = Set("http://schema.org/track"),
        label = "track",
        comment = """A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.""",
        `@extends` = List(),
        `@range` = List(MusicRecording.ontology, ItemList.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}