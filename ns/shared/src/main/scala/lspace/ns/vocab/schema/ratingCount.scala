package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object ratingCount
    extends PropertyDef(
      iri = "http://schema.org/ratingCount",
      iris = Set("http://schema.org/ratingCount"),
      label = "ratingCount",
      comment = """The count of total number of ratings.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
