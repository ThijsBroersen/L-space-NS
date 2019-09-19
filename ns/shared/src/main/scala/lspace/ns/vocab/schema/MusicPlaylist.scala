package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicPlaylist extends OntologyDef(
        iri = "http://schema.org/MusicPlaylist",
        iris = Set("http://schema.org/MusicPlaylist"),
        label = "MusicPlaylist",
        comment = """A collection of music tracks in playlist form.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val numTracks = lspace.ns.vocab.schema.numTracks.property
lazy val track = lspace.ns.vocab.schema.track.property
}
override lazy val properties: List[LProperty] = List(numTracks, track)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val numTracks = lspace.ns.vocab.schema.numTracks.property
lazy val track = lspace.ns.vocab.schema.track.property
}
}