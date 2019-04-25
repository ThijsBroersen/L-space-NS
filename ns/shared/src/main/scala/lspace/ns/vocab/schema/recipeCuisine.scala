package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recipeCuisine
    extends PropertyDef(
      iri = "http://schema.org/recipeCuisine",
      iris = Set("http://schema.org/recipeCuisine"),
      label = "recipeCuisine",
      comment = """The cuisine of the recipe (for example, French or Ethiopian).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
