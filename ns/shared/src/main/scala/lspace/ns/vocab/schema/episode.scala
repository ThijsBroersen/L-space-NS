package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object episode
    extends PropertyDef(
      iri = "http://schema.org/episode",
      iris = Set("http://schema.org/episode"),
      label = "episode",
      comment = """An episode of a tv, radio or game media within a series or season.""",
      `@extends` = () => List(hasPart.property),
      `@range` = () => List(Episode.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.hasPart.Properties
}
