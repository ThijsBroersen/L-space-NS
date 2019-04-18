package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object DefinedTerm
    extends OntologyDef(
      iri = "http://schema.org/DefinedTerm",
      iris = Set("http://schema.org/DefinedTerm"),
      label = "DefinedTerm",
      comment =
        """A word, name, acronym, phrase, etc. with a formal definition. Often used in the context of category or subject classification, glossaries or dictionaries, product or creative work types, etc. Use the name property for the term being defined, use termCode if the term has an alpha-numeric code allocated, use description to provide the definition of the term.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val inDefinedTermSet = lspace.ns.vocab.schema.inDefinedTermSet.property
  }
  override lazy val properties: List[Property] = List(inDefinedTermSet)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val inDefinedTermSet = lspace.ns.vocab.schema.inDefinedTermSet.property
  }
}
