package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ticketedSeat
    extends PropertyDef(
      iri = "http://schema.org/ticketedSeat",
      iris = Set("http://schema.org/ticketedSeat"),
      label = "ticketedSeat",
      comment = """The seat associated with the ticket.""",
      `@extends` = () => List(),
      `@range` = () => List(Seat.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
