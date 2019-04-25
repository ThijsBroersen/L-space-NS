package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recipeYield
    extends PropertyDef(
      iri = "http://schema.org/recipeYield",
      iris = Set("http://schema.org/recipeYield"),
      label = "recipeYield",
      comment =
        """The quantity produced by the recipe (for example, number of people served, number of servings, etc).""",
      `@extends` = () => List(`yield`.property),
      `@range` = () => List(QuantitativeValue.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.`yield`.Properties
}
