package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object inAlbum extends PropertyDef(
        iri = "http://schema.org/inAlbum",
        iris = Set("http://schema.org/inAlbum"),
        label = "inAlbum",
        comment = """The album to which this recording belongs.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}