package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object caption extends PropertyDef(
        iri = "http://schema.org/caption",
        iris = Set("http://schema.org/caption"),
        label = "caption",
        comment = """The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the <a class="localLink" href="http://schema.org/encodingFormat">encodingFormat</a>.""",
        `@extends` = List(),
        `@range` = List(MediaObject.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}