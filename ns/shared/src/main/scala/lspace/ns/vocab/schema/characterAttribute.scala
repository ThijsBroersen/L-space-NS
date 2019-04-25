package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object characterAttribute
    extends PropertyDef(
      iri = "http://schema.org/characterAttribute",
      iris = Set("http://schema.org/characterAttribute"),
      label = "characterAttribute",
      comment =
        """A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).""",
      `@extends` = () => List(),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
