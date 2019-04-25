package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object thumbnail
    extends PropertyDef(
      iri = "http://schema.org/thumbnail",
      iris = Set("http://schema.org/thumbnail"),
      label = "thumbnail",
      comment = """Thumbnail image for an image or video.""",
      `@extends` = () => List(),
      `@range` = () => List(ImageObject.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
