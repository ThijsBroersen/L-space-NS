package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object valueMinLength
    extends PropertyDef(
      iri = "http://schema.org/valueMinLength",
      iris = Set("http://schema.org/valueMinLength"),
      label = "valueMinLength",
      comment = """Specifies the minimum allowed range for number of characters in a literal value.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
