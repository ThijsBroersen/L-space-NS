package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sourceOrganization
    extends PropertyDef(
      iri = "http://schema.org/sourceOrganization",
      iris = Set("http://schema.org/sourceOrganization"),
      label = "sourceOrganization",
      comment = """The Organization on whose behalf the creator was working.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
