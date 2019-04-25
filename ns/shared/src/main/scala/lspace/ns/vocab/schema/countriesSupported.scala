package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object countriesSupported
    extends PropertyDef(
      iri = "http://schema.org/countriesSupported",
      iris = Set("http://schema.org/countriesSupported"),
      label = "countriesSupported",
      comment =
        """Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
