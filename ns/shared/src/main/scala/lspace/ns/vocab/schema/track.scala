package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object track
    extends PropertyDef(
      iri = "http://schema.org/track",
      iris = Set("http://schema.org/track"),
      label = "track",
      comment =
        """A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.""",
      `@extends` = () => List(),
      `@range` = () => List(ItemList.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
