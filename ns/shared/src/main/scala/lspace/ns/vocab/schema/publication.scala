package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object publication
    extends PropertyDef(
      iri = "http://schema.org/publication",
      iris = Set("http://schema.org/publication"),
      label = "publication",
      comment = """A publication event associated with the item.""",
      `@extends` = () => List(),
      `@range` = () => List(PublicationEvent.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
