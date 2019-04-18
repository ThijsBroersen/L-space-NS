package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object sender
    extends PropertyDef(
      iri = "http://schema.org/sender",
      iris = Set("http://schema.org/sender"),
      label = "sender",
      comment = """A sub property of participant. The participant who is at the sending end of the action.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Organization.ontology, Audience.ontology, Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
