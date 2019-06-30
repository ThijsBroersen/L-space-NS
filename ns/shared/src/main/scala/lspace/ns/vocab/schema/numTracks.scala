package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numTracks extends PropertyDef(
        iri = "http://schema.org/numTracks",
        iris = Set("http://schema.org/numTracks"),
        label = "numTracks",
        comment = """The number of tracks in this album or playlist.""",
        `@extends` = () => List(),
        `@range` = () => List(Integer.ontology)
       ){
}