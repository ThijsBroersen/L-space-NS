package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object availability
    extends PropertyDef(
      iri = "http://schema.org/availability",
      iris = Set("http://schema.org/availability"),
      label = "availability",
      comment = """The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.""",
      `@extends` = () => List(),
      `@range` = () => List(ItemAvailability.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
