package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object byArtist extends PropertyDef(
        iri = "http://schema.org/byArtist",
        iris = Set("http://schema.org/byArtist"),
        label = "byArtist",
        comment = """The artist that performed this album or recording.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology, MusicGroup.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}