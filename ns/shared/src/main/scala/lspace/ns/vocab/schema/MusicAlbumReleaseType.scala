package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicAlbumReleaseType extends OntologyDef(
        iri = "http://schema.org/MusicAlbumReleaseType",
        iris = Set("http://schema.org/MusicAlbumReleaseType"),
        label = "MusicAlbumReleaseType",
        comment = """The kind of release which this album is: single, EP or album.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}