package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object suggestedGender
    extends PropertyDef(
      iri = "http://schema.org/suggestedGender",
      iris = Set("http://schema.org/suggestedGender"),
      label = "suggestedGender",
      comment = """The gender of the person or audience.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
