package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object albumReleaseType extends PropertyDef(
        iri = "http://schema.org/albumReleaseType",
        iris = Set("http://schema.org/albumReleaseType"),
        label = "albumReleaseType",
        comment = """The kind of release which this album is: single, EP or album.""",
        `@extends` = () => List(),
        `@range` = () => List(MusicAlbumReleaseType.ontology)
       ){
}