package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isFamilyFriendly
    extends PropertyDef(
      iri = "http://schema.org/isFamilyFriendly",
      iris = Set("http://schema.org/isFamilyFriendly"),
      label = "isFamilyFriendly",
      comment = """Indicates whether this content is family friendly.""",
      `@extends` = () => List(),
      `@range` = () => List(`@boolean`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
