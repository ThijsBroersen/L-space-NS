package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object parentOrganization
    extends PropertyDef(
      iri = "http://schema.org/parentOrganization",
      iris = Set("http://schema.org/parentOrganization"),
      label = "parentOrganization",
      comment =
        """The larger organization that this organization is a <a class="localLink" href="http://schema.org/subOrganization">subOrganization</a> of, if any.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
