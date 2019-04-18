package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object missionCoveragePrioritiesPolicy
    extends PropertyDef(
      iri = "http://schema.org/missionCoveragePrioritiesPolicy",
      iris = Set("http://schema.org/missionCoveragePrioritiesPolicy"),
      label = "missionCoveragePrioritiesPolicy",
      comment =
        """For a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>, a statement on coverage priorities, including any public agenda or stance on issues.""",
      `@extends` = () => List(publishingPrinciples.property),
      `@range` = () => List(CreativeWork.ontology, URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.publishingPrinciples.Properties
}
