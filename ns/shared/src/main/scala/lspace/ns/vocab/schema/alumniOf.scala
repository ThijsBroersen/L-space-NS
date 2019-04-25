package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object alumniOf
    extends PropertyDef(
      iri = "http://schema.org/alumniOf",
      iris = Set("http://schema.org/alumniOf"),
      label = "alumniOf",
      comment = """An organization that the person is an alumni of.""",
      `@extends` = () => List(),
      `@range` = () => List(EducationalOrganization.ontology, Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
