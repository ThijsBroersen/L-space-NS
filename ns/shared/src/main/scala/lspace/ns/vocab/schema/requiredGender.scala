package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object requiredGender
    extends PropertyDef(
      iri = "http://schema.org/requiredGender",
      iris = Set("http://schema.org/requiredGender"),
      label = "requiredGender",
      comment = """Audiences defined by a person's gender.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
