package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bookingAgent
    extends PropertyDef(
      iri = "http://schema.org/bookingAgent",
      iris = Set("http://schema.org/bookingAgent"),
      label = "bookingAgent",
      comment = """'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology, Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
