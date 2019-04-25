package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object afterMedia
    extends PropertyDef(
      iri = "http://schema.org/afterMedia",
      iris = Set("http://schema.org/afterMedia"),
      label = "afterMedia",
      comment = """A media object representing the circumstances after performing this direction.""",
      `@extends` = () => List(),
      `@range` = () => List(MediaObject.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
