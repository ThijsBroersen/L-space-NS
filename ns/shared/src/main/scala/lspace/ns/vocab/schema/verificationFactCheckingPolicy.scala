package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object verificationFactCheckingPolicy
    extends PropertyDef(
      iri = "http://schema.org/verificationFactCheckingPolicy",
      iris = Set("http://schema.org/verificationFactCheckingPolicy"),
      label = "verificationFactCheckingPolicy",
      comment =
        """Disclosure about verification and fact-checking processes for a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> or other fact-checking <a class="localLink" href="http://schema.org/Organization">Organization</a>.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(CreativeWork.ontology, URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
