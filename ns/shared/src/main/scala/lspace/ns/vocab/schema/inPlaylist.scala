package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object inPlaylist
    extends PropertyDef(
      iri = "http://schema.org/inPlaylist",
      iris = Set("http://schema.org/inPlaylist"),
      label = "inPlaylist",
      comment = """The playlist to which this recording belongs.""",
      `@extends` = () => List(),
      `@range` = () => List(MusicPlaylist.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
