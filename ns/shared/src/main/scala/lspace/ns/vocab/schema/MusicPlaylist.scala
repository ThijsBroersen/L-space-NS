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
}