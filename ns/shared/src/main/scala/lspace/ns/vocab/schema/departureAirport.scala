package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object departureAirport
    extends PropertyDef(
      iri = "http://schema.org/departureAirport",
      iris = Set("http://schema.org/departureAirport"),
      label = "departureAirport",
      comment = """The airport where the flight originates.""",
      `@extends` = () => List(),
      `@range` = () => List(Airport.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
