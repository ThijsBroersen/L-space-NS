package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object reservationId
    extends PropertyDef(
      iri = "http://schema.org/reservationId",
      iris = Set("http://schema.org/reservationId"),
      label = "reservationId",
      comment = """A unique identifier for the reservation.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
