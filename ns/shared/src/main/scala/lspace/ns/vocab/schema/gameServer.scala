package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gameServer
    extends PropertyDef(
      iri = "http://schema.org/gameServer",
      iris = Set("http://schema.org/gameServer"),
      label = "gameServer",
      comment = """The server on which  it is possible to play the game.""",
      `@extends` = () => List(),
      `@range` = () => List(GameServer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
