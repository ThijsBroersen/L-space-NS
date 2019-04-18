package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object carbohydrateContent
    extends PropertyDef(
      iri = "http://schema.org/carbohydrateContent",
      iris = Set("http://schema.org/carbohydrateContent"),
      label = "carbohydrateContent",
      comment = """The number of grams of carbohydrates.""",
      `@extends` = () => List(),
      `@range` = () => List(Mass.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
