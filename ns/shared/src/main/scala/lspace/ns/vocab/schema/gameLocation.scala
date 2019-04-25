package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gameLocation
    extends PropertyDef(
      iri = "http://schema.org/gameLocation",
      iris = Set("http://schema.org/gameLocation"),
      label = "gameLocation",
      comment = """Real or fictional location of the game (or part of game).""",
      `@extends` = () => List(),
      `@range` = () => List(PostalAddress.ontology, URL.ontology, Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
