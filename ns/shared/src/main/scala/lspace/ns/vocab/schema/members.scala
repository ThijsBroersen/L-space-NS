package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object members
    extends PropertyDef(
      iri = "http://schema.org/members",
      iris = Set("http://schema.org/members"),
      label = "members",
      comment = """A member of this organization.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology, Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
