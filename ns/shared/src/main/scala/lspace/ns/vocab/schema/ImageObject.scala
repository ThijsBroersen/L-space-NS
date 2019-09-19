package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ImageObject extends OntologyDef(
        iri = "http://schema.org/ImageObject",
        iris = Set("http://schema.org/ImageObject"),
        label = "ImageObject",
        comment = """An image file.""",
        `@extends` = () => List(MediaObject.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val exifData = lspace.ns.vocab.schema.exifData.property
lazy val representativeOfPage = lspace.ns.vocab.schema.representativeOfPage.property
lazy val thumbnail = lspace.ns.vocab.schema.thumbnail.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
override lazy val properties: List[LProperty] = List(caption, exifData, representativeOfPage, thumbnail)
trait Properties extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val exifData = lspace.ns.vocab.schema.exifData.property
lazy val representativeOfPage = lspace.ns.vocab.schema.representativeOfPage.property
lazy val thumbnail = lspace.ns.vocab.schema.thumbnail.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
}