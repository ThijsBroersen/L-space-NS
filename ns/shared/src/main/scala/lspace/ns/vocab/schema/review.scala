package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object review
    extends PropertyDef(
      iri = "http://schema.org/review",
      iris = Set("http://schema.org/review"),
      label = "review",
      comment = """A review of the item.""",
      `@extends` = () => List(),
      `@range` = () => List(Review.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
