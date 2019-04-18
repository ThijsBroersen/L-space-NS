package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object ethicsPolicy
    extends PropertyDef(
      iri = "http://schema.org/ethicsPolicy",
      iris = Set("http://schema.org/ethicsPolicy"),
      label = "ethicsPolicy",
      comment =
        """Statement about ethics policy, e.g. of a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> regarding journalistic and publishing practices, or of a <a class="localLink" href="http://schema.org/Restaurant">Restaurant</a>, a page describing food source policies. In the case of a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>, an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology, CreativeWork.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
