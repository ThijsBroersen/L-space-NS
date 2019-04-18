package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object worstRating
    extends PropertyDef(
      iri = "http://schema.org/worstRating",
      iris = Set("http://schema.org/worstRating"),
      label = "worstRating",
      comment = """The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
