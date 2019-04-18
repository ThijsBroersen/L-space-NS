package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MusicRecording
    extends OntologyDef(
      iri = "http://schema.org/MusicRecording",
      iris = Set("http://schema.org/MusicRecording"),
      label = "MusicRecording",
      comment = """A music recording (track), usually a single song.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val inPlaylist = lspace.ns.vocab.schema.inPlaylist.property
    lazy val byArtist   = lspace.ns.vocab.schema.byArtist.property
    lazy val inAlbum    = lspace.ns.vocab.schema.inAlbum.property
    lazy val isrcCode   = lspace.ns.vocab.schema.isrcCode.property
    lazy val duration   = lspace.ns.vocab.schema.duration.property
  }
  override lazy val properties: List[Property] = List(inPlaylist, byArtist, inAlbum, isrcCode, duration)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val inPlaylist = lspace.ns.vocab.schema.inPlaylist.property
    lazy val byArtist   = lspace.ns.vocab.schema.byArtist.property
    lazy val inAlbum    = lspace.ns.vocab.schema.inAlbum.property
    lazy val isrcCode   = lspace.ns.vocab.schema.isrcCode.property
    lazy val duration   = lspace.ns.vocab.schema.duration.property
  }
}
