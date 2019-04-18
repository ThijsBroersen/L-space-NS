package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object video
    extends PropertyDef(
      iri = "http://schema.org/video",
      iris = Set("http://schema.org/video"),
      label = "video",
      comment = """An embedded video object.""",
      `@extends` = () => List(),
      `@range` = () => List(VideoObject.ontology, Clip.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
