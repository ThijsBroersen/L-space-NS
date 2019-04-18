package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object videoQuality
    extends PropertyDef(
      iri = "http://schema.org/videoQuality",
      iris = Set("http://schema.org/videoQuality"),
      label = "videoQuality",
      comment = """The quality of the video.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
