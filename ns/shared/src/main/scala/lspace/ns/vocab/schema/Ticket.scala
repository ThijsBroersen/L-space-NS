package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Ticket extends OntologyDef(
        iri = "http://schema.org/Ticket",
        iris = Set("http://schema.org/Ticket"),
        label = "Ticket",
        comment = """Used to describe a ticket to an event, a flight, a bus ride, etc.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val dateIssued = lspace.ns.vocab.schema.dateIssued.property
lazy val issuedBy = lspace.ns.vocab.schema.issuedBy.property
lazy val priceCurrency = lspace.ns.vocab.schema.priceCurrency.property
lazy val ticketNumber = lspace.ns.vocab.schema.ticketNumber.property
lazy val ticketToken = lspace.ns.vocab.schema.ticketToken.property
lazy val ticketedSeat = lspace.ns.vocab.schema.ticketedSeat.property
lazy val totalPrice = lspace.ns.vocab.schema.totalPrice.property
lazy val underName = lspace.ns.vocab.schema.underName.property
}
override lazy val properties: List[LProperty] = List(dateIssued, issuedBy, priceCurrency, ticketNumber, ticketToken, ticketedSeat, totalPrice, underName)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val dateIssued = lspace.ns.vocab.schema.dateIssued.property
lazy val issuedBy = lspace.ns.vocab.schema.issuedBy.property
lazy val priceCurrency = lspace.ns.vocab.schema.priceCurrency.property
lazy val ticketNumber = lspace.ns.vocab.schema.ticketNumber.property
lazy val ticketToken = lspace.ns.vocab.schema.ticketToken.property
lazy val ticketedSeat = lspace.ns.vocab.schema.ticketedSeat.property
lazy val totalPrice = lspace.ns.vocab.schema.totalPrice.property
lazy val underName = lspace.ns.vocab.schema.underName.property
}
}