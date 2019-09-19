package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NutritionInformation extends OntologyDef(
        iri = "http://schema.org/NutritionInformation",
        iris = Set("http://schema.org/NutritionInformation"),
        label = "NutritionInformation",
        comment = """Nutritional information about the recipe.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val calories = lspace.ns.vocab.schema.calories.property
lazy val carbohydrateContent = lspace.ns.vocab.schema.carbohydrateContent.property
lazy val cholesterolContent = lspace.ns.vocab.schema.cholesterolContent.property
lazy val fatContent = lspace.ns.vocab.schema.fatContent.property
lazy val fiberContent = lspace.ns.vocab.schema.fiberContent.property
lazy val proteinContent = lspace.ns.vocab.schema.proteinContent.property
lazy val saturatedFatContent = lspace.ns.vocab.schema.saturatedFatContent.property
lazy val servingSize = lspace.ns.vocab.schema.servingSize.property
lazy val sodiumContent = lspace.ns.vocab.schema.sodiumContent.property
lazy val sugarContent = lspace.ns.vocab.schema.sugarContent.property
lazy val transFatContent = lspace.ns.vocab.schema.transFatContent.property
lazy val unsaturatedFatContent = lspace.ns.vocab.schema.unsaturatedFatContent.property
}
override lazy val properties: List[LProperty] = List(calories, carbohydrateContent, cholesterolContent, fatContent, fiberContent, proteinContent, saturatedFatContent, servingSize, sodiumContent, sugarContent, transFatContent, unsaturatedFatContent)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val calories = lspace.ns.vocab.schema.calories.property
lazy val carbohydrateContent = lspace.ns.vocab.schema.carbohydrateContent.property
lazy val cholesterolContent = lspace.ns.vocab.schema.cholesterolContent.property
lazy val fatContent = lspace.ns.vocab.schema.fatContent.property
lazy val fiberContent = lspace.ns.vocab.schema.fiberContent.property
lazy val proteinContent = lspace.ns.vocab.schema.proteinContent.property
lazy val saturatedFatContent = lspace.ns.vocab.schema.saturatedFatContent.property
lazy val servingSize = lspace.ns.vocab.schema.servingSize.property
lazy val sodiumContent = lspace.ns.vocab.schema.sodiumContent.property
lazy val sugarContent = lspace.ns.vocab.schema.sugarContent.property
lazy val transFatContent = lspace.ns.vocab.schema.transFatContent.property
lazy val unsaturatedFatContent = lspace.ns.vocab.schema.unsaturatedFatContent.property
}
}