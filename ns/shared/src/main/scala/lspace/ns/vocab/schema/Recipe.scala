package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Recipe
    extends OntologyDef(
      iri = "http://schema.org/Recipe",
      iris = Set("http://schema.org/Recipe"),
      label = "Recipe",
      comment =
        """A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via <a class="localLink" href="http://schema.org/suitableForDiet">suitableForDiet</a>. The <a class="localLink" href="http://schema.org/keywords">keywords</a> property can also be used to add more detail.""",
      `@extends` = () => List(HowTo.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.HowTo.Properties {
    lazy val recipeIngredient   = lspace.ns.vocab.schema.recipeIngredient.property
    lazy val suitableForDiet    = lspace.ns.vocab.schema.suitableForDiet.property
    lazy val recipeCategory     = lspace.ns.vocab.schema.recipeCategory.property
    lazy val cookingMethod      = lspace.ns.vocab.schema.cookingMethod.property
    lazy val cookTime           = lspace.ns.vocab.schema.cookTime.property
    lazy val ingredients        = lspace.ns.vocab.schema.ingredients.property
    lazy val recipeCuisine      = lspace.ns.vocab.schema.recipeCuisine.property
    lazy val nutrition          = lspace.ns.vocab.schema.nutrition.property
    lazy val recipeYield        = lspace.ns.vocab.schema.recipeYield.property
    lazy val recipeInstructions = lspace.ns.vocab.schema.recipeInstructions.property
  }
  override lazy val properties: List[Property] = List(recipeIngredient,
                                                      suitableForDiet,
                                                      recipeCategory,
                                                      cookingMethod,
                                                      cookTime,
                                                      ingredients,
                                                      recipeCuisine,
                                                      nutrition,
                                                      recipeYield,
                                                      recipeInstructions)
  trait Properties extends lspace.ns.vocab.schema.HowTo.Properties {
    lazy val recipeIngredient   = lspace.ns.vocab.schema.recipeIngredient.property
    lazy val suitableForDiet    = lspace.ns.vocab.schema.suitableForDiet.property
    lazy val recipeCategory     = lspace.ns.vocab.schema.recipeCategory.property
    lazy val cookingMethod      = lspace.ns.vocab.schema.cookingMethod.property
    lazy val cookTime           = lspace.ns.vocab.schema.cookTime.property
    lazy val ingredients        = lspace.ns.vocab.schema.ingredients.property
    lazy val recipeCuisine      = lspace.ns.vocab.schema.recipeCuisine.property
    lazy val nutrition          = lspace.ns.vocab.schema.nutrition.property
    lazy val recipeYield        = lspace.ns.vocab.schema.recipeYield.property
    lazy val recipeInstructions = lspace.ns.vocab.schema.recipeInstructions.property
  }
}
