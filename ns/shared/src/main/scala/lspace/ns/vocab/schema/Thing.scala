package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Thing extends OntologyDef(
        iri = "http://schema.org/Thing",
        iris = Set("http://schema.org/Thing"),
        label = "Thing",
        comment = """The most generic type of item.""",
        `@extends` = List()
       ){
object keys {
lazy val additionalType = lspace.ns.vocab.schema.additionalType.property
lazy val alternateName = lspace.ns.vocab.schema.alternateName.property
lazy val description = lspace.ns.vocab.schema.description.property
lazy val disambiguatingDescription = lspace.ns.vocab.schema.disambiguatingDescription.property
lazy val identifier = lspace.ns.vocab.schema.identifier.property
lazy val image = lspace.ns.vocab.schema.image.property
lazy val mainEntityOfPage = lspace.ns.vocab.schema.mainEntityOfPage.property
lazy val name = lspace.ns.vocab.schema.name.property
lazy val potentialAction = lspace.ns.vocab.schema.potentialAction.property
lazy val sameAs = lspace.ns.vocab.schema.sameAs.property
lazy val subjectOf = lspace.ns.vocab.schema.subjectOf.property
lazy val url = lspace.ns.vocab.schema.url.property
}
override lazy val properties: List[LProperty] = List(additionalType, alternateName, description, disambiguatingDescription, identifier, image, mainEntityOfPage, name, potentialAction, sameAs, subjectOf, url)
trait Properties {
lazy val additionalType = lspace.ns.vocab.schema.additionalType.property
lazy val alternateName = lspace.ns.vocab.schema.alternateName.property
lazy val description = lspace.ns.vocab.schema.description.property
lazy val disambiguatingDescription = lspace.ns.vocab.schema.disambiguatingDescription.property
lazy val identifier = lspace.ns.vocab.schema.identifier.property
lazy val image = lspace.ns.vocab.schema.image.property
lazy val mainEntityOfPage = lspace.ns.vocab.schema.mainEntityOfPage.property
lazy val name = lspace.ns.vocab.schema.name.property
lazy val potentialAction = lspace.ns.vocab.schema.potentialAction.property
lazy val sameAs = lspace.ns.vocab.schema.sameAs.property
lazy val subjectOf = lspace.ns.vocab.schema.subjectOf.property
lazy val url = lspace.ns.vocab.schema.url.property
}
}