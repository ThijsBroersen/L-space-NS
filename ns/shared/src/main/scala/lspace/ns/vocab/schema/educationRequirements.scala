package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object educationRequirements
    extends PropertyDef(
      iri = "http://schema.org/educationRequirements",
      iris = Set("http://schema.org/educationRequirements"),
      label = "educationRequirements",
      comment = """Educational background needed for the position or Occupation.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
