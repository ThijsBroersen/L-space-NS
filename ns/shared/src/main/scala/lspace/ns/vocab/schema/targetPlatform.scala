package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object targetPlatform
    extends PropertyDef(
      iri = "http://schema.org/targetPlatform",
      iris = Set("http://schema.org/targetPlatform"),
      label = "targetPlatform",
      comment = """Type of app development: phone, Metro style, desktop, XBox, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
