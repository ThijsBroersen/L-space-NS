package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object cheatCode
    extends PropertyDef(
      iri = "http://schema.org/cheatCode",
      iris = Set("http://schema.org/cheatCode"),
      label = "cheatCode",
      comment = """Cheat codes to the game.""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
