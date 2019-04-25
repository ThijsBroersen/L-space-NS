package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object risks
    extends PropertyDef(
      iri = "http://schema.org/risks",
      iris = Set("http://schema.org/risks"),
      label = "risks",
      comment = """Specific physiologic risks associated to the diet plan.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
