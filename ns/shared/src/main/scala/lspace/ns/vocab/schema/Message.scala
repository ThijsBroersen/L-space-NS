package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Message extends OntologyDef(
        iri = "http://schema.org/Message",
        iris = Set("http://schema.org/Message"),
        label = "Message",
        comment = """A single message from a sender to one or more organizations or people.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val bccRecipient = lspace.ns.vocab.schema.bccRecipient.property
lazy val ccRecipient = lspace.ns.vocab.schema.ccRecipient.property
lazy val dateRead = lspace.ns.vocab.schema.dateRead.property
lazy val dateReceived = lspace.ns.vocab.schema.dateReceived.property
lazy val dateSent = lspace.ns.vocab.schema.dateSent.property
lazy val messageAttachment = lspace.ns.vocab.schema.messageAttachment.property
lazy val recipient = lspace.ns.vocab.schema.recipient.property
lazy val sender = lspace.ns.vocab.schema.sender.property
lazy val toRecipient = lspace.ns.vocab.schema.toRecipient.property
}
override lazy val properties: List[LProperty] = List(bccRecipient, ccRecipient, dateRead, dateReceived, dateSent, messageAttachment, recipient, sender, toRecipient)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val bccRecipient = lspace.ns.vocab.schema.bccRecipient.property
lazy val ccRecipient = lspace.ns.vocab.schema.ccRecipient.property
lazy val dateRead = lspace.ns.vocab.schema.dateRead.property
lazy val dateReceived = lspace.ns.vocab.schema.dateReceived.property
lazy val dateSent = lspace.ns.vocab.schema.dateSent.property
lazy val messageAttachment = lspace.ns.vocab.schema.messageAttachment.property
lazy val recipient = lspace.ns.vocab.schema.recipient.property
lazy val sender = lspace.ns.vocab.schema.sender.property
lazy val toRecipient = lspace.ns.vocab.schema.toRecipient.property
}
}