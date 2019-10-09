package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object musicReleaseFormat extends PropertyDef(
        iri = "http://schema.org/musicReleaseFormat",
        iris = Set("http://schema.org/musicReleaseFormat"),
        label = "musicReleaseFormat",
        comment = """Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).""",
        `@extends` = List(),
        `@range` = List(MusicReleaseFormatType.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}