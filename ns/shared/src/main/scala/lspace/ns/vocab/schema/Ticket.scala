package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Ticket
    extends OntologyDef(
      iri = "http://schema.org/Ticket",
      iris = Set("http://schema.org/Ticket"),
      label = "Ticket",
      comment = """Used to describe a ticket to an event, a flight, a bus ride, etc.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val dateIssued   = lspace.ns.vocab.schema.dateIssued.property
    lazy val ticketedSeat = lspace.ns.vocab.schema.ticketedSeat.property
  }
  override lazy val properties: List[LProperty] = List(dateIssued, ticketedSeat)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val dateIssued   = lspace.ns.vocab.schema.dateIssued.property
    lazy val ticketedSeat = lspace.ns.vocab.schema.ticketedSeat.property
  }
}
