package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object member
    extends PropertyDef(
      iri = "http://schema.org/member",
      iris = Set("http://schema.org/member"),
      label = "member",
      comment =
        """A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology, Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
