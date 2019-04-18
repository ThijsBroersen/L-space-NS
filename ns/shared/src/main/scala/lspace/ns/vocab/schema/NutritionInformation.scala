package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object NutritionInformation
    extends OntologyDef(
      iri = "http://schema.org/NutritionInformation",
      iris = Set("http://schema.org/NutritionInformation"),
      label = "NutritionInformation",
      comment = """Nutritional information about the recipe.""",
      `@extends` = () => List(StructuredValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val transFatContent     = lspace.ns.vocab.schema.transFatContent.property
    lazy val fiberContent        = lspace.ns.vocab.schema.fiberContent.property
    lazy val servingSize         = lspace.ns.vocab.schema.servingSize.property
    lazy val carbohydrateContent = lspace.ns.vocab.schema.carbohydrateContent.property
    lazy val sodiumContent       = lspace.ns.vocab.schema.sodiumContent.property
    lazy val calories            = lspace.ns.vocab.schema.calories.property
    lazy val proteinContent      = lspace.ns.vocab.schema.proteinContent.property
  }
  override lazy val properties: List[Property] =
    List(transFatContent, fiberContent, servingSize, carbohydrateContent, sodiumContent, calories, proteinContent)
  trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties {
    lazy val transFatContent     = lspace.ns.vocab.schema.transFatContent.property
    lazy val fiberContent        = lspace.ns.vocab.schema.fiberContent.property
    lazy val servingSize         = lspace.ns.vocab.schema.servingSize.property
    lazy val carbohydrateContent = lspace.ns.vocab.schema.carbohydrateContent.property
    lazy val sodiumContent       = lspace.ns.vocab.schema.sodiumContent.property
    lazy val calories            = lspace.ns.vocab.schema.calories.property
    lazy val proteinContent      = lspace.ns.vocab.schema.proteinContent.property
  }
}
