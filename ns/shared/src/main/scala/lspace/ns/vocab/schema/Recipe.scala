package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Recipe extends OntologyDef(
        iri = "http://schema.org/Recipe",
        iris = Set("http://schema.org/Recipe"),
        label = "Recipe",
        comment = """A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via <a class="localLink" href="http://schema.org/suitableForDiet">suitableForDiet</a>. The <a class="localLink" href="http://schema.org/keywords">keywords</a> property can also be used to add more detail.""",
        `@extends` = () => List(HowTo.ontology)
       ){
object keys extends lspace.ns.vocab.schema.HowTo.Properties{
lazy val cookTime = lspace.ns.vocab.schema.cookTime.property
lazy val cookingMethod = lspace.ns.vocab.schema.cookingMethod.property
lazy val nutrition = lspace.ns.vocab.schema.nutrition.property
lazy val recipeCategory = lspace.ns.vocab.schema.recipeCategory.property
lazy val recipeCuisine = lspace.ns.vocab.schema.recipeCuisine.property
lazy val recipeIngredient = lspace.ns.vocab.schema.recipeIngredient.property
lazy val recipeInstructions = lspace.ns.vocab.schema.recipeInstructions.property
lazy val recipeYield = lspace.ns.vocab.schema.recipeYield.property
lazy val suitableForDiet = lspace.ns.vocab.schema.suitableForDiet.property
}
override lazy val properties: List[LProperty] = List(cookTime, cookingMethod, nutrition, recipeCategory, recipeCuisine, recipeIngredient, recipeInstructions, recipeYield, suitableForDiet)
trait Properties extends lspace.ns.vocab.schema.HowTo.Properties{
lazy val cookTime = lspace.ns.vocab.schema.cookTime.property
lazy val cookingMethod = lspace.ns.vocab.schema.cookingMethod.property
lazy val nutrition = lspace.ns.vocab.schema.nutrition.property
lazy val recipeCategory = lspace.ns.vocab.schema.recipeCategory.property
lazy val recipeCuisine = lspace.ns.vocab.schema.recipeCuisine.property
lazy val recipeIngredient = lspace.ns.vocab.schema.recipeIngredient.property
lazy val recipeInstructions = lspace.ns.vocab.schema.recipeInstructions.property
lazy val recipeYield = lspace.ns.vocab.schema.recipeYield.property
lazy val suitableForDiet = lspace.ns.vocab.schema.suitableForDiet.property
}
}