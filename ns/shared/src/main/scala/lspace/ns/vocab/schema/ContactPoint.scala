package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object ContactPoint extends OntologyDef(
        iri = "https://schema.org/ContactPoint",
        iris = Set("https://schema.org/ContactPoint"),
        label = "ContactPoint",
        comment = """A contact point&#x2014;for example, a Customer Complaints department.""",
        `@extends` = () => List(StructuredValue)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage
lazy val email = lspace.ns.vocab.schema.email
lazy val hoursAvailable = lspace.ns.vocab.schema.hoursAvailable
lazy val contactType = lspace.ns.vocab.schema.contactType
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val areaServed = lspace.ns.vocab.schema.areaServed
lazy val telephone = lspace.ns.vocab.schema.telephone
lazy val serviceArea = lspace.ns.vocab.schema.serviceArea
lazy val contactOption = lspace.ns.vocab.schema.contactOption
lazy val productSupported = lspace.ns.vocab.schema.productSupported}
override lazy val properties: List[Property] = List(availableLanguage, email, hoursAvailable, contactType, faxNumber, areaServed, telephone, serviceArea, contactOption, productSupported)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage
lazy val email = lspace.ns.vocab.schema.email
lazy val hoursAvailable = lspace.ns.vocab.schema.hoursAvailable
lazy val contactType = lspace.ns.vocab.schema.contactType
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val areaServed = lspace.ns.vocab.schema.areaServed
lazy val telephone = lspace.ns.vocab.schema.telephone
lazy val serviceArea = lspace.ns.vocab.schema.serviceArea
lazy val contactOption = lspace.ns.vocab.schema.contactOption
lazy val productSupported = lspace.ns.vocab.schema.productSupported}
}