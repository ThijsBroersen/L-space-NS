package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Service extends OntologyDef(
        iri = "http://schema.org/Service",
        iris = Set("http://schema.org/Service"),
        label = "Service",
        comment = """A service provided by an organization, e.g. delivery service, print services, etc.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val availableChannel = lspace.ns.vocab.schema.availableChannel.property
lazy val award = lspace.ns.vocab.schema.award.property
lazy val brand = lspace.ns.vocab.schema.brand.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val hasOfferCatalog = lspace.ns.vocab.schema.hasOfferCatalog.property
lazy val hoursAvailable = lspace.ns.vocab.schema.hoursAvailable.property
lazy val isRelatedTo = lspace.ns.vocab.schema.isRelatedTo.property
lazy val isSimilarTo = lspace.ns.vocab.schema.isSimilarTo.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val providerMobility = lspace.ns.vocab.schema.providerMobility.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val serviceOutput = lspace.ns.vocab.schema.serviceOutput.property
lazy val serviceType = lspace.ns.vocab.schema.serviceType.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val termsOfService = lspace.ns.vocab.schema.termsOfService.property
}
override lazy val properties: List[LProperty] = List(aggregateRating, areaServed, audience, availableChannel, award, brand, broker, category, hasOfferCatalog, hoursAvailable, isRelatedTo, isSimilarTo, logo, offers, provider, providerMobility, review, serviceOutput, serviceType, slogan, termsOfService)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val audience = lspace.ns.vocab.schema.audience.property
lazy val availableChannel = lspace.ns.vocab.schema.availableChannel.property
lazy val award = lspace.ns.vocab.schema.award.property
lazy val brand = lspace.ns.vocab.schema.brand.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val hasOfferCatalog = lspace.ns.vocab.schema.hasOfferCatalog.property
lazy val hoursAvailable = lspace.ns.vocab.schema.hoursAvailable.property
lazy val isRelatedTo = lspace.ns.vocab.schema.isRelatedTo.property
lazy val isSimilarTo = lspace.ns.vocab.schema.isSimilarTo.property
lazy val logo = lspace.ns.vocab.schema.logo.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val providerMobility = lspace.ns.vocab.schema.providerMobility.property
lazy val review = lspace.ns.vocab.schema.review.property
lazy val serviceOutput = lspace.ns.vocab.schema.serviceOutput.property
lazy val serviceType = lspace.ns.vocab.schema.serviceType.property
lazy val slogan = lspace.ns.vocab.schema.slogan.property
lazy val termsOfService = lspace.ns.vocab.schema.termsOfService.property
}
}