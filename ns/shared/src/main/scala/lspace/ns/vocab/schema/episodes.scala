package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object episodes
    extends PropertyDef(
      iri = "http://schema.org/episodes",
      iris = Set("http://schema.org/episodes"),
      label = "episodes",
      comment = """An episode of a TV/radio series or season.""",
      `@extends` = () => List(),
      `@range` = () => List(Episode.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
