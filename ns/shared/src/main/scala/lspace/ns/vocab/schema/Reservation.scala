package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Reservation extends OntologyDef(
        iri = "http://schema.org/Reservation",
        iris = Set("http://schema.org/Reservation"),
        label = "Reservation",
        comment = """Describes a reservation for travel, dining or an event. Some reservations require tickets. <br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use <a class="localLink" href="http://schema.org/Offer">Offer</a>.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val bookingTime = lspace.ns.vocab.schema.bookingTime.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val modifiedTime = lspace.ns.vocab.schema.modifiedTime.property
lazy val priceCurrency = lspace.ns.vocab.schema.priceCurrency.property
lazy val programMembershipUsed = lspace.ns.vocab.schema.programMembershipUsed.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val reservationFor = lspace.ns.vocab.schema.reservationFor.property
lazy val reservationId = lspace.ns.vocab.schema.reservationId.property
lazy val reservationStatus = lspace.ns.vocab.schema.reservationStatus.property
lazy val reservedTicket = lspace.ns.vocab.schema.reservedTicket.property
lazy val totalPrice = lspace.ns.vocab.schema.totalPrice.property
lazy val underName = lspace.ns.vocab.schema.underName.property
}
override lazy val properties: List[LProperty] = List(bookingTime, broker, modifiedTime, priceCurrency, programMembershipUsed, provider, reservationFor, reservationId, reservationStatus, reservedTicket, totalPrice, underName)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val bookingTime = lspace.ns.vocab.schema.bookingTime.property
lazy val broker = lspace.ns.vocab.schema.broker.property
lazy val modifiedTime = lspace.ns.vocab.schema.modifiedTime.property
lazy val priceCurrency = lspace.ns.vocab.schema.priceCurrency.property
lazy val programMembershipUsed = lspace.ns.vocab.schema.programMembershipUsed.property
lazy val provider = lspace.ns.vocab.schema.provider.property
lazy val reservationFor = lspace.ns.vocab.schema.reservationFor.property
lazy val reservationId = lspace.ns.vocab.schema.reservationId.property
lazy val reservationStatus = lspace.ns.vocab.schema.reservationStatus.property
lazy val reservedTicket = lspace.ns.vocab.schema.reservedTicket.property
lazy val totalPrice = lspace.ns.vocab.schema.totalPrice.property
lazy val underName = lspace.ns.vocab.schema.underName.property
}
}