package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicAlbumProductionType extends OntologyDef(
        iri = "http://schema.org/MusicAlbumProductionType",
        iris = Set("http://schema.org/MusicAlbumProductionType"),
        label = "MusicAlbumProductionType",
        comment = """Classification of the album by it's type of content: soundtrack, live album, studio album, etc.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}