package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object articleSection
    extends PropertyDef(
      iri = "http://schema.org/articleSection",
      iris = Set("http://schema.org/articleSection"),
      label = "articleSection",
      comment =
        """Articles may belong to one or more 'sections' in a magazine or newspaper, such as Sports, Lifestyle, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
