package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object videoFrameSize
    extends PropertyDef(
      iri = "http://schema.org/videoFrameSize",
      iris = Set("http://schema.org/videoFrameSize"),
      label = "videoFrameSize",
      comment = """The frame size of the video.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
