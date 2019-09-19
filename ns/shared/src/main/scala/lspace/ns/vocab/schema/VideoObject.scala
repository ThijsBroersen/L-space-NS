package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VideoObject extends OntologyDef(
        iri = "http://schema.org/VideoObject",
        iris = Set("http://schema.org/VideoObject"),
        label = "VideoObject",
        comment = """A video file.""",
        `@extends` = () => List(MediaObject.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val thumbnail = lspace.ns.vocab.schema.thumbnail.property
lazy val transcript = lspace.ns.vocab.schema.transcript.property
lazy val videoFrameSize = lspace.ns.vocab.schema.videoFrameSize.property
lazy val videoQuality = lspace.ns.vocab.schema.videoQuality.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
override lazy val properties: List[LProperty] = List(actor, caption, director, musicBy, thumbnail, transcript, videoFrameSize, videoQuality)
trait Properties extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val actor = lspace.ns.vocab.schema.actor.property
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val director = lspace.ns.vocab.schema.director.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val thumbnail = lspace.ns.vocab.schema.thumbnail.property
lazy val transcript = lspace.ns.vocab.schema.transcript.property
lazy val videoFrameSize = lspace.ns.vocab.schema.videoFrameSize.property
lazy val videoQuality = lspace.ns.vocab.schema.videoQuality.property
override lazy val encodingFormat = lspace.ns.vocab.schema.encodingFormat.property}
}