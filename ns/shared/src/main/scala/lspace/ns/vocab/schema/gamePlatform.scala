package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gamePlatform
    extends PropertyDef(
      iri = "http://schema.org/gamePlatform",
      iris = Set("http://schema.org/gamePlatform"),
      label = "gamePlatform",
      comment =
        """The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, URL.ontology, Thing.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
