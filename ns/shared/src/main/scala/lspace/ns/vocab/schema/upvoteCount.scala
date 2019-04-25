package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object upvoteCount
    extends PropertyDef(
      iri = "http://schema.org/upvoteCount",
      iris = Set("http://schema.org/upvoteCount"),
      label = "upvoteCount",
      comment = """The number of upvotes this question, answer or comment has received from the community.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
