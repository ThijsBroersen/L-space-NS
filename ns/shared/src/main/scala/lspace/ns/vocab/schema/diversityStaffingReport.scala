package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object diversityStaffingReport
    extends PropertyDef(
      iri = "http://schema.org/diversityStaffingReport",
      iris = Set("http://schema.org/diversityStaffingReport"),
      label = "diversityStaffingReport",
      comment =
        """For an <a class="localLink" href="http://schema.org/Organization">Organization</a> (often but not necessarily a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(Article.ontology, URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
