package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object unnamedSourcesPolicy
    extends PropertyDef(
      iri = "http://schema.org/unnamedSourcesPolicy",
      iris = Set("http://schema.org/unnamedSourcesPolicy"),
      label = "unnamedSourcesPolicy",
      comment =
        """For an <a class="localLink" href="http://schema.org/Organization">Organization</a> (typically a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a statement about policy on use of unnamed sources and the decision process required.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(URL.ontology, CreativeWork.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
