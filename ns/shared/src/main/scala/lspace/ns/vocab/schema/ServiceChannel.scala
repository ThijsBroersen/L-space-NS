package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ServiceChannel
    extends OntologyDef(
      iri = "http://schema.org/ServiceChannel",
      iris = Set("http://schema.org/ServiceChannel"),
      label = "ServiceChannel",
      comment = """A means for accessing a service, e.g. a government office location, web site, or phone number.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val processingTime       = lspace.ns.vocab.schema.processingTime.property
    lazy val providesService      = lspace.ns.vocab.schema.providesService.property
    lazy val availableLanguage    = lspace.ns.vocab.schema.availableLanguage.property
    lazy val serviceUrl           = lspace.ns.vocab.schema.serviceUrl.property
    lazy val servicePostalAddress = lspace.ns.vocab.schema.servicePostalAddress.property
    lazy val serviceLocation      = lspace.ns.vocab.schema.serviceLocation.property
    lazy val servicePhone         = lspace.ns.vocab.schema.servicePhone.property
    lazy val serviceSmsNumber     = lspace.ns.vocab.schema.serviceSmsNumber.property
  }
  override lazy val properties: List[LProperty] = List(processingTime,
                                                       providesService,
                                                       availableLanguage,
                                                       serviceUrl,
                                                       servicePostalAddress,
                                                       serviceLocation,
                                                       servicePhone,
                                                       serviceSmsNumber)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val processingTime       = lspace.ns.vocab.schema.processingTime.property
    lazy val providesService      = lspace.ns.vocab.schema.providesService.property
    lazy val availableLanguage    = lspace.ns.vocab.schema.availableLanguage.property
    lazy val serviceUrl           = lspace.ns.vocab.schema.serviceUrl.property
    lazy val servicePostalAddress = lspace.ns.vocab.schema.servicePostalAddress.property
    lazy val serviceLocation      = lspace.ns.vocab.schema.serviceLocation.property
    lazy val servicePhone         = lspace.ns.vocab.schema.servicePhone.property
    lazy val serviceSmsNumber     = lspace.ns.vocab.schema.serviceSmsNumber.property
  }
}
