package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Flight extends OntologyDef(
        iri = "http://schema.org/Flight",
        iris = Set("http://schema.org/Flight"),
        label = "Flight",
        comment = """An airline flight.""",
        `@extends` = () => List(Trip.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Trip.Properties{
lazy val aircraft = lspace.ns.vocab.schema.aircraft.property
lazy val arrivalAirport = lspace.ns.vocab.schema.arrivalAirport.property
lazy val arrivalGate = lspace.ns.vocab.schema.arrivalGate.property
lazy val arrivalTerminal = lspace.ns.vocab.schema.arrivalTerminal.property
lazy val boardingPolicy = lspace.ns.vocab.schema.boardingPolicy.property
lazy val departureAirport = lspace.ns.vocab.schema.departureAirport.property
lazy val departureGate = lspace.ns.vocab.schema.departureGate.property
lazy val departureTerminal = lspace.ns.vocab.schema.departureTerminal.property
lazy val estimatedFlightDuration = lspace.ns.vocab.schema.estimatedFlightDuration.property
lazy val flightDistance = lspace.ns.vocab.schema.flightDistance.property
lazy val flightNumber = lspace.ns.vocab.schema.flightNumber.property
lazy val mealService = lspace.ns.vocab.schema.mealService.property
lazy val seller = lspace.ns.vocab.schema.seller.property
lazy val webCheckinTime = lspace.ns.vocab.schema.webCheckinTime.property
}
override lazy val properties: List[LProperty] = List(aircraft, arrivalAirport, arrivalGate, arrivalTerminal, boardingPolicy, departureAirport, departureGate, departureTerminal, estimatedFlightDuration, flightDistance, flightNumber, mealService, seller, webCheckinTime)
trait Properties extends lspace.ns.vocab.schema.Trip.Properties{
lazy val aircraft = lspace.ns.vocab.schema.aircraft.property
lazy val arrivalAirport = lspace.ns.vocab.schema.arrivalAirport.property
lazy val arrivalGate = lspace.ns.vocab.schema.arrivalGate.property
lazy val arrivalTerminal = lspace.ns.vocab.schema.arrivalTerminal.property
lazy val boardingPolicy = lspace.ns.vocab.schema.boardingPolicy.property
lazy val departureAirport = lspace.ns.vocab.schema.departureAirport.property
lazy val departureGate = lspace.ns.vocab.schema.departureGate.property
lazy val departureTerminal = lspace.ns.vocab.schema.departureTerminal.property
lazy val estimatedFlightDuration = lspace.ns.vocab.schema.estimatedFlightDuration.property
lazy val flightDistance = lspace.ns.vocab.schema.flightDistance.property
lazy val flightNumber = lspace.ns.vocab.schema.flightNumber.property
lazy val mealService = lspace.ns.vocab.schema.mealService.property
lazy val seller = lspace.ns.vocab.schema.seller.property
lazy val webCheckinTime = lspace.ns.vocab.schema.webCheckinTime.property
}
}