package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object valueMaxLength
    extends PropertyDef(
      iri = "http://schema.org/valueMaxLength",
      iris = Set("http://schema.org/valueMaxLength"),
      label = "valueMaxLength",
      comment = """Specifies the allowed range for number of characters in a literal value.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
