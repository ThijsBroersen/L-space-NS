package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object recipeCategory
    extends PropertyDef(
      iri = "http://schema.org/recipeCategory",
      iris = Set("http://schema.org/recipeCategory"),
      label = "recipeCategory",
      comment = """The category of the recipe—for example, appetizer, entree, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
