package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object free
    extends PropertyDef(
      iri = "http://schema.org/free",
      iris = Set("http://schema.org/free"),
      label = "free",
      comment = """A flag to signal that the item, event, or place is accessible for free.""",
      `@extends` = () => List(),
      `@range` = () => List(`@boolean`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
