package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Flight
    extends OntologyDef(
      iri = "http://schema.org/Flight",
      iris = Set("http://schema.org/Flight"),
      label = "Flight",
      comment = """An airline flight.""",
      `@extends` = () => List(Trip.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Trip.Properties {
    lazy val departureGate           = lspace.ns.vocab.schema.departureGate.property
    lazy val arrivalTerminal         = lspace.ns.vocab.schema.arrivalTerminal.property
    lazy val boardingPolicy          = lspace.ns.vocab.schema.boardingPolicy.property
    lazy val webCheckinTime          = lspace.ns.vocab.schema.webCheckinTime.property
    lazy val flightNumber            = lspace.ns.vocab.schema.flightNumber.property
    lazy val flightDistance          = lspace.ns.vocab.schema.flightDistance.property
    lazy val mealService             = lspace.ns.vocab.schema.mealService.property
    lazy val seller                  = lspace.ns.vocab.schema.seller.property
    lazy val aircraft                = lspace.ns.vocab.schema.aircraft.property
    lazy val estimatedFlightDuration = lspace.ns.vocab.schema.estimatedFlightDuration.property
    lazy val departureTerminal       = lspace.ns.vocab.schema.departureTerminal.property
  }
  override lazy val properties: List[Property] = List(
    departureGate,
    arrivalTerminal,
    boardingPolicy,
    webCheckinTime,
    flightNumber,
    flightDistance,
    mealService,
    seller,
    aircraft,
    estimatedFlightDuration,
    departureTerminal
  )
  trait Properties extends lspace.ns.vocab.schema.Trip.Properties {
    lazy val departureGate           = lspace.ns.vocab.schema.departureGate.property
    lazy val arrivalTerminal         = lspace.ns.vocab.schema.arrivalTerminal.property
    lazy val boardingPolicy          = lspace.ns.vocab.schema.boardingPolicy.property
    lazy val webCheckinTime          = lspace.ns.vocab.schema.webCheckinTime.property
    lazy val flightNumber            = lspace.ns.vocab.schema.flightNumber.property
    lazy val flightDistance          = lspace.ns.vocab.schema.flightDistance.property
    lazy val mealService             = lspace.ns.vocab.schema.mealService.property
    lazy val seller                  = lspace.ns.vocab.schema.seller.property
    lazy val aircraft                = lspace.ns.vocab.schema.aircraft.property
    lazy val estimatedFlightDuration = lspace.ns.vocab.schema.estimatedFlightDuration.property
    lazy val departureTerminal       = lspace.ns.vocab.schema.departureTerminal.property
  }
}
