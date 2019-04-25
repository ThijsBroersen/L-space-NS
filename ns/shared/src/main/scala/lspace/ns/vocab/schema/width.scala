package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object width
    extends PropertyDef(
      iri = "http://schema.org/width",
      iris = Set("http://schema.org/width"),
      label = "width",
      comment = """The width of the item.""",
      `@extends` = () => List(),
      `@range` = () => List(Distance.ontology, QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
