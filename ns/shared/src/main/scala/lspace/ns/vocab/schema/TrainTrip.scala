package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TrainTrip extends OntologyDef(
        iri = "http://schema.org/TrainTrip",
        iris = Set("http://schema.org/TrainTrip"),
        label = "TrainTrip",
        comment = """A trip on a commercial train line.""",
        `@extends` = () => List(Trip.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Trip.Properties{
lazy val arrivalPlatform = lspace.ns.vocab.schema.arrivalPlatform.property
lazy val arrivalStation = lspace.ns.vocab.schema.arrivalStation.property
lazy val departurePlatform = lspace.ns.vocab.schema.departurePlatform.property
lazy val departureStation = lspace.ns.vocab.schema.departureStation.property
lazy val trainName = lspace.ns.vocab.schema.trainName.property
lazy val trainNumber = lspace.ns.vocab.schema.trainNumber.property
}
override lazy val properties: List[LProperty] = List(arrivalPlatform, arrivalStation, departurePlatform, departureStation, trainName, trainNumber)
trait Properties extends lspace.ns.vocab.schema.Trip.Properties{
lazy val arrivalPlatform = lspace.ns.vocab.schema.arrivalPlatform.property
lazy val arrivalStation = lspace.ns.vocab.schema.arrivalStation.property
lazy val departurePlatform = lspace.ns.vocab.schema.departurePlatform.property
lazy val departureStation = lspace.ns.vocab.schema.departureStation.property
lazy val trainName = lspace.ns.vocab.schema.trainName.property
lazy val trainNumber = lspace.ns.vocab.schema.trainNumber.property
}
}