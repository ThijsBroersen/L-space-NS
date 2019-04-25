package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hostingOrganization
    extends PropertyDef(
      iri = "http://schema.org/hostingOrganization",
      iris = Set("http://schema.org/hostingOrganization"),
      label = "hostingOrganization",
      comment = """The organization (airline, travelers' club, etc.) the membership is made with.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
