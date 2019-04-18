package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object contentUrl
    extends PropertyDef(
      iri = "http://schema.org/contentUrl",
      iris = Set("http://schema.org/contentUrl"),
      label = "contentUrl",
      comment = """Actual bytes of the media object, for example the image file or video file.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
