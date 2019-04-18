package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AggregateOffer
    extends OntologyDef(
      iri = "http://schema.org/AggregateOffer",
      iris = Set("http://schema.org/AggregateOffer"),
      label = "AggregateOffer",
      comment =
        """When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.""",
      `@extends` = () => List(Offer.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Offer.Properties {
    lazy val highPrice  = lspace.ns.vocab.schema.highPrice.property
    lazy val lowPrice   = lspace.ns.vocab.schema.lowPrice.property
    lazy val offerCount = lspace.ns.vocab.schema.offerCount.property
    lazy val offers     = lspace.ns.vocab.schema.offers.property
  }
  override lazy val properties: List[Property] = List(highPrice, lowPrice, offerCount, offers)
  trait Properties extends lspace.ns.vocab.schema.Offer.Properties {
    lazy val highPrice  = lspace.ns.vocab.schema.highPrice.property
    lazy val lowPrice   = lspace.ns.vocab.schema.lowPrice.property
    lazy val offerCount = lspace.ns.vocab.schema.offerCount.property
    lazy val offers     = lspace.ns.vocab.schema.offers.property
  }
}
