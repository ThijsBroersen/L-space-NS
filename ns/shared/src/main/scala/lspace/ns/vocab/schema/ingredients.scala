package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ingredients
    extends PropertyDef(
      iri = "http://schema.org/ingredients",
      iris = Set("http://schema.org/ingredients"),
      label = "ingredients",
      comment = """A single ingredient used in the recipe, e.g. sugar, flour or garlic.""",
      `@extends` = () => List(supply.property),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.supply.Properties
}
