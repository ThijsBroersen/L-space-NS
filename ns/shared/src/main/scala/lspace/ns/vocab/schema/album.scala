package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object album extends PropertyDef(
        iri = "http://schema.org/album",
        iris = Set("http://schema.org/album"),
        label = "album",
        comment = """A music album.""",
        `@extends` = List(),
        `@range` = List(MusicAlbum.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}