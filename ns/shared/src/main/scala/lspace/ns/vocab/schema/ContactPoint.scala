package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object ContactPoint extends OntologyDef(
        iri = "https://schema.org/ContactPoint",
        iris = Set("https://schema.org/ContactPoint"),
        label = "ContactPoint",
        comment = """A contact point&#x2014;for example, a Customer Complaints department.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage
lazy val email = lspace.ns.vocab.schema.email
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val areaServed = lspace.ns.vocab.schema.areaServed
lazy val telephone = lspace.ns.vocab.schema.telephone}
override lazy val properties: List[Property] = List(availableLanguage, email, faxNumber, areaServed, telephone)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val availableLanguage = lspace.ns.vocab.schema.availableLanguage
lazy val email = lspace.ns.vocab.schema.email
lazy val faxNumber = lspace.ns.vocab.schema.faxNumber
lazy val areaServed = lspace.ns.vocab.schema.areaServed
lazy val telephone = lspace.ns.vocab.schema.telephone}
}