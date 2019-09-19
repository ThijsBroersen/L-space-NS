package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PostalAddress extends OntologyDef(
        iri = "http://schema.org/PostalAddress",
        iris = Set("http://schema.org/PostalAddress"),
        label = "PostalAddress",
        comment = """The mailing address.""",
        `@extends` = () => List(ContactPoint.ontology)
       ){
object keys extends lspace.ns.vocab.schema.ContactPoint.Properties{
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry.property
lazy val addressLocality = lspace.ns.vocab.schema.addressLocality.property
lazy val addressRegion = lspace.ns.vocab.schema.addressRegion.property
lazy val postOfficeBoxNumber = lspace.ns.vocab.schema.postOfficeBoxNumber.property
lazy val postalCode = lspace.ns.vocab.schema.postalCode.property
lazy val streetAddress = lspace.ns.vocab.schema.streetAddress.property
}
override lazy val properties: List[LProperty] = List(addressCountry, addressLocality, addressRegion, postOfficeBoxNumber, postalCode, streetAddress)
trait Properties extends lspace.ns.vocab.schema.ContactPoint.Properties{
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry.property
lazy val addressLocality = lspace.ns.vocab.schema.addressLocality.property
lazy val addressRegion = lspace.ns.vocab.schema.addressRegion.property
lazy val postOfficeBoxNumber = lspace.ns.vocab.schema.postOfficeBoxNumber.property
lazy val postalCode = lspace.ns.vocab.schema.postalCode.property
lazy val streetAddress = lspace.ns.vocab.schema.streetAddress.property
}
}