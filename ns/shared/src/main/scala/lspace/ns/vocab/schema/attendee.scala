package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object attendee
    extends PropertyDef(
      iri = "http://schema.org/attendee",
      iris = Set("http://schema.org/attendee"),
      label = "attendee",
      comment = """A person or organization attending the event.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology, Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
