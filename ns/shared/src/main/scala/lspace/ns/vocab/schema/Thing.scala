package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object Thing extends OntologyDef(
        iri = "https://schema.org/Thing",
        iris = Set("https://schema.org/Thing"),
        label = "Thing",
        comment = """The most generic type of item.""",
        `@extends` = () => List()
       ){
object keys {
lazy val description = lspace.ns.vocab.schema.description
lazy val sameAs = lspace.ns.vocab.schema.sameAs
lazy val url = lspace.ns.vocab.schema.url
lazy val potentialAction = lspace.ns.vocab.schema.potentialAction
lazy val additionalType = lspace.ns.vocab.schema.additionalType
lazy val name = lspace.ns.vocab.schema.name
lazy val disambiguatingDescription = lspace.ns.vocab.schema.disambiguatingDescription
lazy val subjectOf = lspace.ns.vocab.schema.subjectOf
lazy val alternateName = lspace.ns.vocab.schema.alternateName
lazy val identifier = lspace.ns.vocab.schema.identifier
lazy val image = lspace.ns.vocab.schema.image
lazy val mainEntityOfPage = lspace.ns.vocab.schema.mainEntityOfPage}
override lazy val properties: List[Property] = List(description, sameAs, url, potentialAction, additionalType, name, disambiguatingDescription, subjectOf, alternateName, identifier, image, mainEntityOfPage)
trait Properties {
lazy val description = lspace.ns.vocab.schema.description
lazy val sameAs = lspace.ns.vocab.schema.sameAs
lazy val url = lspace.ns.vocab.schema.url
lazy val potentialAction = lspace.ns.vocab.schema.potentialAction
lazy val additionalType = lspace.ns.vocab.schema.additionalType
lazy val name = lspace.ns.vocab.schema.name
lazy val disambiguatingDescription = lspace.ns.vocab.schema.disambiguatingDescription
lazy val subjectOf = lspace.ns.vocab.schema.subjectOf
lazy val alternateName = lspace.ns.vocab.schema.alternateName
lazy val identifier = lspace.ns.vocab.schema.identifier
lazy val image = lspace.ns.vocab.schema.image
lazy val mainEntityOfPage = lspace.ns.vocab.schema.mainEntityOfPage}
}