package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object serviceOperator
    extends PropertyDef(
      iri = "http://schema.org/serviceOperator",
      iris = Set("http://schema.org/serviceOperator"),
      label = "serviceOperator",
      comment =
        """The operating organization, if different from the provider.  This enables the representation of services that are provided by an organization, but operated by another organization like a subcontractor.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
