package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bitrate extends PropertyDef(
        iri = "http://schema.org/bitrate",
        iris = Set("http://schema.org/bitrate"),
        label = "bitrate",
        comment = """The bitrate of the media object.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}