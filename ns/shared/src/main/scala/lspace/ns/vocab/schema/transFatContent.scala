package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object transFatContent
    extends PropertyDef(
      iri = "http://schema.org/transFatContent",
      iris = Set("http://schema.org/transFatContent"),
      label = "transFatContent",
      comment = """The number of grams of trans fat.""",
      `@extends` = () => List(),
      `@range` = () => List(Mass.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
