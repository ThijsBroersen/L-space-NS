package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contactPoint
    extends PropertyDef(
      iri = "http://schema.org/contactPoint",
      iris = Set("http://schema.org/contactPoint"),
      label = "contactPoint",
      comment = """A contact point for a person or organization.""",
      `@extends` = () => List(),
      `@range` = () => List(ContactPoint.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
