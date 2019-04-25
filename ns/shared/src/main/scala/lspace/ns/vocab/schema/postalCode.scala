package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object postalCode
    extends PropertyDef(
      iri = "http://schema.org/postalCode",
      iris = Set("http://schema.org/postalCode"),
      label = "postalCode",
      comment = """The postal code. For example, 94043.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
