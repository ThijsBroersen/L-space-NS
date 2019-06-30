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
}