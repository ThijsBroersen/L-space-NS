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
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val videoQuality = lspace.ns.vocab.schema.videoQuality.property
}
override lazy val properties: List[LProperty] = List(actors, caption, videoQuality)
trait Properties extends lspace.ns.vocab.schema.MediaObject.Properties{
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val caption = lspace.ns.vocab.schema.caption.property
lazy val videoQuality = lspace.ns.vocab.schema.videoQuality.property
}
}