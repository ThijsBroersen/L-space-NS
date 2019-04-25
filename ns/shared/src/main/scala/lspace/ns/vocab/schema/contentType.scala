package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contentType
    extends PropertyDef(
      iri = "http://schema.org/contentType",
      iris = Set("http://schema.org/contentType"),
      label = "contentType",
      comment = """The supported content type(s) for an EntryPoint response.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
