package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Message
    extends OntologyDef(
      iri = "http://schema.org/Message",
      iris = Set("http://schema.org/Message"),
      label = "Message",
      comment = """A single message from a sender to one or more organizations or people.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val dateReceived      = lspace.ns.vocab.schema.dateReceived.property
    lazy val sender            = lspace.ns.vocab.schema.sender.property
    lazy val toRecipient       = lspace.ns.vocab.schema.toRecipient.property
    lazy val recipient         = lspace.ns.vocab.schema.recipient.property
    lazy val messageAttachment = lspace.ns.vocab.schema.messageAttachment.property
  }
  override lazy val properties: List[Property] = List(dateReceived, sender, toRecipient, recipient, messageAttachment)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val dateReceived      = lspace.ns.vocab.schema.dateReceived.property
    lazy val sender            = lspace.ns.vocab.schema.sender.property
    lazy val toRecipient       = lspace.ns.vocab.schema.toRecipient.property
    lazy val recipient         = lspace.ns.vocab.schema.recipient.property
    lazy val messageAttachment = lspace.ns.vocab.schema.messageAttachment.property
  }
}
