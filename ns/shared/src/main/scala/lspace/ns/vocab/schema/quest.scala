package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object quest
    extends PropertyDef(
      iri = "http://schema.org/quest",
      iris = Set("http://schema.org/quest"),
      label = "quest",
      comment =
        """The task that a player-controlled character, or group of characters may complete in order to gain a reward.""",
      `@extends` = () => List(),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
