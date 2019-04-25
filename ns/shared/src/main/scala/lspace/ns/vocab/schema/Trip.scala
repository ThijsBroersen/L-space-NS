package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Trip
    extends OntologyDef(
      iri = "http://schema.org/Trip",
      iris = Set("http://schema.org/Trip"),
      label = "Trip",
      comment = """A trip or journey. An itinerary of visits to one or more places.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val departureTime = lspace.ns.vocab.schema.departureTime.property
    lazy val offers        = lspace.ns.vocab.schema.offers.property
    lazy val itinerary     = lspace.ns.vocab.schema.itinerary.property
    lazy val partOfTrip    = lspace.ns.vocab.schema.partOfTrip.property
    lazy val provider      = lspace.ns.vocab.schema.provider.property
    lazy val arrivalTime   = lspace.ns.vocab.schema.arrivalTime.property
    lazy val subTrip       = lspace.ns.vocab.schema.subTrip.property
  }
  override lazy val properties: List[LProperty] =
    List(departureTime, offers, itinerary, partOfTrip, provider, arrivalTime, subTrip)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val departureTime = lspace.ns.vocab.schema.departureTime.property
    lazy val offers        = lspace.ns.vocab.schema.offers.property
    lazy val itinerary     = lspace.ns.vocab.schema.itinerary.property
    lazy val partOfTrip    = lspace.ns.vocab.schema.partOfTrip.property
    lazy val provider      = lspace.ns.vocab.schema.provider.property
    lazy val arrivalTime   = lspace.ns.vocab.schema.arrivalTime.property
    lazy val subTrip       = lspace.ns.vocab.schema.subTrip.property
  }
}
