package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object PostalAddress extends OntologyDef(
        iri = "https://schema.org/PostalAddress",
        iris = Set("https://schema.org/PostalAddress"),
        label = "PostalAddress",
        comment = """The mailing address.""",
        `@extends` = () => List(ContactPoint.ontology)
       ){
object keys extends lspace.ns.vocab.schema.ContactPoint.Properties{
lazy val streetAddress = lspace.ns.vocab.schema.streetAddress
lazy val addressLocality = lspace.ns.vocab.schema.addressLocality
lazy val postOfficeBoxNumber = lspace.ns.vocab.schema.postOfficeBoxNumber
lazy val addressRegion = lspace.ns.vocab.schema.addressRegion
lazy val postalCode = lspace.ns.vocab.schema.postalCode
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry}
override lazy val properties: List[Property] = List(streetAddress, addressLocality, postOfficeBoxNumber, addressRegion, postalCode, addressCountry)
trait Properties extends lspace.ns.vocab.schema.ContactPoint.Properties{
lazy val streetAddress = lspace.ns.vocab.schema.streetAddress
lazy val addressLocality = lspace.ns.vocab.schema.addressLocality
lazy val postOfficeBoxNumber = lspace.ns.vocab.schema.postOfficeBoxNumber
lazy val addressRegion = lspace.ns.vocab.schema.addressRegion
lazy val postalCode = lspace.ns.vocab.schema.postalCode
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry}
}