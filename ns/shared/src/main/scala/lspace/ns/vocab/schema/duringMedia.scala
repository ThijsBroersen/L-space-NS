package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object duringMedia
    extends PropertyDef(
      iri = "http://schema.org/duringMedia",
      iris = Set("http://schema.org/duringMedia"),
      label = "duringMedia",
      comment = """A media object representing the circumstances while performing this direction.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology, MediaObject.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
