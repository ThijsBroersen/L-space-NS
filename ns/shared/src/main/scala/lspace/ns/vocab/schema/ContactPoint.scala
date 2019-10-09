package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ContactPoint extends OntologyDef(
        iri = "http://schema.org/ContactPoint",
        iris = Set("http://schema.org/ContactPoint"),
        label = "ContactPoint",
        comment = """A contact point&#x2014;for example, a Customer Complaints department.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage.property
lazy val contactOption = lspace.ns.vocab.schema.contactOption.property
lazy val contactType = lspace.ns.vocab.schema.contactType.property
lazy val email = lspace.ns.vocab.schema.email.property
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
lazy val hoursAvailable = lspace.ns.vocab.schema.hoursAvailable.property
lazy val productSupported = lspace.ns.vocab.schema.productSupported.property
lazy val telephone = lspace.ns.vocab.schema.telephone.property
}
override lazy val properties: List[LProperty] = List(areaServed, availableLanguage, contactOption, contactType, email, faxNumber, hoursAvailable, productSupported, telephone)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage.property
lazy val contactOption = lspace.ns.vocab.schema.contactOption.property
lazy val contactType = lspace.ns.vocab.schema.contactType.property
lazy val email = lspace.ns.vocab.schema.email.property
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
lazy val hoursAvailable = lspace.ns.vocab.schema.hoursAvailable.property
lazy val productSupported = lspace.ns.vocab.schema.productSupported.property
lazy val telephone = lspace.ns.vocab.schema.telephone.property
}
}