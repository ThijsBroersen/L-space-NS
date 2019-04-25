package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Offer
    extends OntologyDef(
      iri = "http://schema.org/Offer",
      iris = Set("http://schema.org/Offer"),
      label = "Offer",
      comment =
        """An offer to transfer some rights to an item or to provide a service — for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.<br/><br/>

For <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GTIN</a>-related fields, see <a href="http://www.gs1.org/barcodes/support/check_digit_calculator">Check Digit calculator</a> and <a href="http://www.gs1us.org/resources/standards/gtin-validation-guide">validation guide</a> from <a href="http://www.gs1.org/">GS1</a>.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val itemCondition         = lspace.ns.vocab.schema.itemCondition.property
    lazy val availabilityEnds      = lspace.ns.vocab.schema.availabilityEnds.property
    lazy val eligibleDuration      = lspace.ns.vocab.schema.eligibleDuration.property
    lazy val businessFunction      = lspace.ns.vocab.schema.businessFunction.property
    lazy val itemOffered           = lspace.ns.vocab.schema.itemOffered.property
    lazy val eligibleCustomerType  = lspace.ns.vocab.schema.eligibleCustomerType.property
    lazy val offeredBy             = lspace.ns.vocab.schema.offeredBy.property
    lazy val acceptedPaymentMethod = lspace.ns.vocab.schema.acceptedPaymentMethod.property
    lazy val seller                = lspace.ns.vocab.schema.seller.property
    lazy val availability          = lspace.ns.vocab.schema.availability.property
    lazy val deliveryLeadTime      = lspace.ns.vocab.schema.deliveryLeadTime.property
    lazy val review                = lspace.ns.vocab.schema.review.property
    lazy val eligibleRegion        = lspace.ns.vocab.schema.eligibleRegion.property
  }
  override lazy val properties: List[LProperty] = List(
    itemCondition,
    availabilityEnds,
    eligibleDuration,
    businessFunction,
    itemOffered,
    eligibleCustomerType,
    offeredBy,
    acceptedPaymentMethod,
    seller,
    availability,
    deliveryLeadTime,
    review,
    eligibleRegion
  )
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val itemCondition         = lspace.ns.vocab.schema.itemCondition.property
    lazy val availabilityEnds      = lspace.ns.vocab.schema.availabilityEnds.property
    lazy val eligibleDuration      = lspace.ns.vocab.schema.eligibleDuration.property
    lazy val businessFunction      = lspace.ns.vocab.schema.businessFunction.property
    lazy val itemOffered           = lspace.ns.vocab.schema.itemOffered.property
    lazy val eligibleCustomerType  = lspace.ns.vocab.schema.eligibleCustomerType.property
    lazy val offeredBy             = lspace.ns.vocab.schema.offeredBy.property
    lazy val acceptedPaymentMethod = lspace.ns.vocab.schema.acceptedPaymentMethod.property
    lazy val seller                = lspace.ns.vocab.schema.seller.property
    lazy val availability          = lspace.ns.vocab.schema.availability.property
    lazy val deliveryLeadTime      = lspace.ns.vocab.schema.deliveryLeadTime.property
    lazy val review                = lspace.ns.vocab.schema.review.property
    lazy val eligibleRegion        = lspace.ns.vocab.schema.eligibleRegion.property
  }
}
