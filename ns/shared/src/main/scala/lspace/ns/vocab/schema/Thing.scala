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
lazy val sameAs = lspace.ns.vocab.schema.sameAs
lazy val url = lspace.ns.vocab.schema.url
lazy val disambiguatingDescription = lspace.ns.vocab.schema.disambiguatingDescription
lazy val subjectOf = lspace.ns.vocab.schema.subjectOf
lazy val mainEntityOfPage = lspace.ns.vocab.schema.mainEntityOfPage}
override lazy val properties: List[Property] = List(url, disambiguatingDescription, subjectOf, mainEntityOfPage)
trait Properties {
lazy val url = lspace.ns.vocab.schema.url
lazy val disambiguatingDescription = lspace.ns.vocab.schema.disambiguatingDescription
lazy val subjectOf = lspace.ns.vocab.schema.subjectOf
lazy val mainEntityOfPage = lspace.ns.vocab.schema.mainEntityOfPage}
}