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
}