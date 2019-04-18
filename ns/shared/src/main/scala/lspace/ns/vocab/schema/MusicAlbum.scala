package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicAlbum extends OntologyDef(
        iri = "http://schema.org/MusicAlbum",
        iris = Set("http://schema.org/MusicAlbum"),
        label = "MusicAlbum",
        comment = """A collection of music tracks.""",
        `@extends` = () => List(MusicPlaylist.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MusicPlaylist.Properties{
lazy val albumRelease = lspace.ns.vocab.schema.albumRelease.property
lazy val byArtist = lspace.ns.vocab.schema.byArtist.property
lazy val albumReleaseType = lspace.ns.vocab.schema.albumReleaseType.property
lazy val albumProductionType = lspace.ns.vocab.schema.albumProductionType.property
}
override lazy val properties: List[LProperty] = List(albumRelease, byArtist, albumReleaseType, albumProductionType)
trait Properties extends lspace.ns.vocab.schema.MusicPlaylist.Properties{
lazy val albumRelease = lspace.ns.vocab.schema.albumRelease.property
lazy val byArtist = lspace.ns.vocab.schema.byArtist.property
lazy val albumReleaseType = lspace.ns.vocab.schema.albumReleaseType.property
lazy val albumProductionType = lspace.ns.vocab.schema.albumProductionType.property
}
}