package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object photos
    extends PropertyDef(
      iri = "http://schema.org/photos",
      iris = Set("http://schema.org/photos"),
      label = "photos",
      comment = """Photographs of this place.""",
      `@extends` = () => List(),
      `@range` = () => List(ImageObject.ontology, Photograph.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
