package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object lastReviewed
    extends PropertyDef(
      iri = "http://schema.org/lastReviewed",
      iris = Set("http://schema.org/lastReviewed"),
      label = "lastReviewed",
      comment = """Date on which the content on this web page was last reviewed for accuracy and/or completeness.""",
      `@extends` = () => List(),
      `@range` = () => List(`@date`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
