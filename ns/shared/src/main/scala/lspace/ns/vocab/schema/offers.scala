package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object offers
    extends PropertyDef(
      iri = "http://schema.org/offers",
      iris = Set("http://schema.org/offers"),
      label = "offers",
      comment =
        """An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.""",
      `@extends` = () => List(),
      `@range` = () => List(Offer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
