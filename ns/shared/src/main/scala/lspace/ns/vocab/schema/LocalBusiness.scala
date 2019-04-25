package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LocalBusiness
    extends OntologyDef(
      iri = "http://schema.org/LocalBusiness",
      iris = Set("http://schema.org/LocalBusiness"),
      label = "LocalBusiness",
      comment =
        """A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.""",
      `@extends` = () => List(Place.ontology, Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Place.Properties with lspace.ns.vocab.schema.Organization.Properties {
    lazy val openingHours       = lspace.ns.vocab.schema.openingHours.property
    lazy val paymentAccepted    = lspace.ns.vocab.schema.paymentAccepted.property
    lazy val currenciesAccepted = lspace.ns.vocab.schema.currenciesAccepted.property
    lazy val branchOf           = lspace.ns.vocab.schema.branchOf.property
    lazy val priceRange         = lspace.ns.vocab.schema.priceRange.property
    override lazy val events    = lspace.ns.vocab.schema.events.property
    override lazy val slogan    = lspace.ns.vocab.schema.slogan.property
    override lazy val event     = lspace.ns.vocab.schema.event.property
    override lazy val logo      = lspace.ns.vocab.schema.logo.property
    override lazy val telephone = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4    = lspace.ns.vocab.schema.isicV4.property
    override lazy val review    = lspace.ns.vocab.schema.review.property
  }
  override lazy val properties: List[LProperty] =
    List(openingHours, paymentAccepted, currenciesAccepted, branchOf, priceRange)
  trait Properties extends lspace.ns.vocab.schema.Place.Properties with lspace.ns.vocab.schema.Organization.Properties {
    lazy val openingHours       = lspace.ns.vocab.schema.openingHours.property
    lazy val paymentAccepted    = lspace.ns.vocab.schema.paymentAccepted.property
    lazy val currenciesAccepted = lspace.ns.vocab.schema.currenciesAccepted.property
    lazy val branchOf           = lspace.ns.vocab.schema.branchOf.property
    lazy val priceRange         = lspace.ns.vocab.schema.priceRange.property
    override lazy val events    = lspace.ns.vocab.schema.events.property
    override lazy val slogan    = lspace.ns.vocab.schema.slogan.property
    override lazy val event     = lspace.ns.vocab.schema.event.property
    override lazy val logo      = lspace.ns.vocab.schema.logo.property
    override lazy val telephone = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4    = lspace.ns.vocab.schema.isicV4.property
    override lazy val review    = lspace.ns.vocab.schema.review.property
  }
}
