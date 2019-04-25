package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recommendationStrength
    extends PropertyDef(
      iri = "http://schema.org/recommendationStrength",
      iris = Set("http://schema.org/recommendationStrength"),
      label = "recommendationStrength",
      comment = """Strength of the guideline's recommendation (e.g. 'class I').""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
