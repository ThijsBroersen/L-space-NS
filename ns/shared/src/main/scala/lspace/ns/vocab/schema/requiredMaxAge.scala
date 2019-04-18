package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object requiredMaxAge
    extends PropertyDef(
      iri = "http://schema.org/requiredMaxAge",
      iris = Set("http://schema.org/requiredMaxAge"),
      label = "requiredMaxAge",
      comment = """Audiences defined by a person's maximum age.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
