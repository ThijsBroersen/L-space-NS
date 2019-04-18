package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object actionableFeedbackPolicy
    extends PropertyDef(
      iri = "http://schema.org/actionableFeedbackPolicy",
      iris = Set("http://schema.org/actionableFeedbackPolicy"),
      label = "actionableFeedbackPolicy",
      comment =
        """For a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> or other news-related <a class="localLink" href="http://schema.org/Organization">Organization</a>, a statement about public engagement activities (for news media, the newsroom’s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(CreativeWork.ontology, URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
