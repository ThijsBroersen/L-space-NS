package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object spokenByCharacter
    extends PropertyDef(
      iri = "http://schema.org/spokenByCharacter",
      iris = Set("http://schema.org/spokenByCharacter"),
      label = "spokenByCharacter",
      comment =
        """The (e.g. fictional) character, Person or Organization to whom the quotation is attributed within the containing CreativeWork.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology, Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
