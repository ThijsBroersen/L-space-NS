package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object albumRelease extends PropertyDef(
        iri = "http://schema.org/albumRelease",
        iris = Set("http://schema.org/albumRelease"),
        label = "albumRelease",
        comment = """A release of this album.""",
        `@extends` = () => List(),
        `@range` = () => List(MusicRelease.ontology)
       ){
}