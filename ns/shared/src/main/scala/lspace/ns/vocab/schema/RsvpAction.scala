package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object RsvpAction
    extends OntologyDef(
      iri = "http://schema.org/RsvpAction",
      iris = Set("http://schema.org/RsvpAction"),
      label = "RsvpAction",
      comment = """The act of notifying an event organizer as to whether you expect to attend the event.""",
      `@extends` = () => List(InformAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.InformAction.Properties {
    lazy val rsvpResponse             = lspace.ns.vocab.schema.rsvpResponse.property
    lazy val comment                  = lspace.ns.vocab.schema.comment.property
    lazy val additionalNumberOfGuests = lspace.ns.vocab.schema.additionalNumberOfGuests.property
  }
  override lazy val properties: List[Property] = List(rsvpResponse, comment, additionalNumberOfGuests)
  trait Properties extends lspace.ns.vocab.schema.InformAction.Properties {
    lazy val rsvpResponse             = lspace.ns.vocab.schema.rsvpResponse.property
    lazy val comment                  = lspace.ns.vocab.schema.comment.property
    lazy val additionalNumberOfGuests = lspace.ns.vocab.schema.additionalNumberOfGuests.property
  }
}
