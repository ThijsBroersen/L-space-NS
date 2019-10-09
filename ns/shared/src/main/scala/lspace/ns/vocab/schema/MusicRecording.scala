package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicRecording extends OntologyDef(
        iri = "http://schema.org/MusicRecording",
        iris = Set("http://schema.org/MusicRecording"),
        label = "MusicRecording",
        comment = """A music recording (track), usually a single song.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val byArtist = lspace.ns.vocab.schema.byArtist.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val inAlbum = lspace.ns.vocab.schema.inAlbum.property
lazy val inPlaylist = lspace.ns.vocab.schema.inPlaylist.property
lazy val isrcCode = lspace.ns.vocab.schema.isrcCode.property
lazy val recordingOf = lspace.ns.vocab.schema.recordingOf.property
}
override lazy val properties: List[LProperty] = List(byArtist, duration, inAlbum, inPlaylist, isrcCode, recordingOf)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val byArtist = lspace.ns.vocab.schema.byArtist.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val inAlbum = lspace.ns.vocab.schema.inAlbum.property
lazy val inPlaylist = lspace.ns.vocab.schema.inPlaylist.property
lazy val isrcCode = lspace.ns.vocab.schema.isrcCode.property
lazy val recordingOf = lspace.ns.vocab.schema.recordingOf.property
}
}