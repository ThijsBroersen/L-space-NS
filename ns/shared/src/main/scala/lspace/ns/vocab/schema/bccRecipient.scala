package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object bccRecipient
    extends PropertyDef(
      iri = "http://schema.org/bccRecipient",
      iris = Set("http://schema.org/bccRecipient"),
      label = "bccRecipient",
      comment = """A sub property of recipient. The recipient blind copied on a message.""",
      `@extends` = () => List(recipient.property),
      `@range` = () => List(Organization.ontology, Person.ontology, ContactPoint.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.recipient.Properties
}
