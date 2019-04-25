package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object musicalKey
    extends PropertyDef(
      iri = "http://schema.org/musicalKey",
      iris = Set("http://schema.org/musicalKey"),
      label = "musicalKey",
      comment = """The key, mode, or scale this composition uses.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
