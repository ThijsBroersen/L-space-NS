package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicRelease extends OntologyDef(
        iri = "http://schema.org/MusicRelease",
        iris = Set("http://schema.org/MusicRelease"),
        label = "MusicRelease",
        comment = """A MusicRelease is a specific release of a music album.""",
        `@extends` = () => List(MusicPlaylist.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MusicPlaylist.Properties{
lazy val releaseOf = lspace.ns.vocab.schema.releaseOf.property
lazy val catalogNumber = lspace.ns.vocab.schema.catalogNumber.property
lazy val musicReleaseFormat = lspace.ns.vocab.schema.musicReleaseFormat.property
lazy val creditedTo = lspace.ns.vocab.schema.creditedTo.property
lazy val duration = lspace.ns.vocab.schema.duration.property
}
override lazy val properties: List[LProperty] = List(releaseOf, catalogNumber, musicReleaseFormat, creditedTo, duration)
trait Properties extends lspace.ns.vocab.schema.MusicPlaylist.Properties{
lazy val releaseOf = lspace.ns.vocab.schema.releaseOf.property
lazy val catalogNumber = lspace.ns.vocab.schema.catalogNumber.property
lazy val musicReleaseFormat = lspace.ns.vocab.schema.musicReleaseFormat.property
lazy val creditedTo = lspace.ns.vocab.schema.creditedTo.property
lazy val duration = lspace.ns.vocab.schema.duration.property
}
}