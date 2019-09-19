package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Seat extends OntologyDef(
        iri = "http://schema.org/Seat",
        iris = Set("http://schema.org/Seat"),
        label = "Seat",
        comment = """Used to describe a seat, such as a reserved seat in an event reservation.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val seatNumber = lspace.ns.vocab.schema.seatNumber.property
lazy val seatRow = lspace.ns.vocab.schema.seatRow.property
lazy val seatSection = lspace.ns.vocab.schema.seatSection.property
lazy val seatingType = lspace.ns.vocab.schema.seatingType.property
}
override lazy val properties: List[LProperty] = List(seatNumber, seatRow, seatSection, seatingType)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val seatNumber = lspace.ns.vocab.schema.seatNumber.property
lazy val seatRow = lspace.ns.vocab.schema.seatRow.property
lazy val seatSection = lspace.ns.vocab.schema.seatSection.property
lazy val seatingType = lspace.ns.vocab.schema.seatingType.property
}
}