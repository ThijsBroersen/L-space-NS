package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object namedPosition
    extends PropertyDef(
      iri = "http://schema.org/namedPosition",
      iris = Set("http://schema.org/namedPosition"),
      label = "namedPosition",
      comment =
        """A position played, performed or filled by a person or organization, as part of an organization. For example, an athlete in a SportsTeam might play in the position named 'Quarterback'.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
