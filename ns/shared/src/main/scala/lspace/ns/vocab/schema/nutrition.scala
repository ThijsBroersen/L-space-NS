package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object nutrition
    extends PropertyDef(
      iri = "http://schema.org/nutrition",
      iris = Set("http://schema.org/nutrition"),
      label = "nutrition",
      comment = """Nutrition information about the recipe or menu item.""",
      `@extends` = () => List(),
      `@range` = () => List(NutritionInformation.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
