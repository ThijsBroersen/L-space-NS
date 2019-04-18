package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object inLanguage
    extends PropertyDef(
      iri = "http://schema.org/inLanguage",
      iris = Set("http://schema.org/inLanguage"),
      label = "inLanguage",
      comment =
        """The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.""",
      `@extends` = () => List(),
      `@range` = () => List(Language.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
