package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object albums extends PropertyDef(
        iri = "http://schema.org/albums",
        iris = Set("http://schema.org/albums"),
        label = "albums",
        comment = """A collection of music albums.""",
        `@extends` = () => List(),
        `@range` = () => List(MusicAlbum.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}