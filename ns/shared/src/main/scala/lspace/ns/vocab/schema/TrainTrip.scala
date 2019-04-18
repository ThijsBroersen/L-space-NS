package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TrainTrip
    extends OntologyDef(
      iri = "http://schema.org/TrainTrip",
      iris = Set("http://schema.org/TrainTrip"),
      label = "TrainTrip",
      comment = """A trip on a commercial train line.""",
      `@extends` = () => List(Trip.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Trip.Properties {
    lazy val arrivalStation    = lspace.ns.vocab.schema.arrivalStation.property
    lazy val trainNumber       = lspace.ns.vocab.schema.trainNumber.property
    lazy val trainName         = lspace.ns.vocab.schema.trainName.property
    lazy val departurePlatform = lspace.ns.vocab.schema.departurePlatform.property
  }
  override lazy val properties: List[Property] = List(arrivalStation, trainNumber, trainName, departurePlatform)
  trait Properties extends lspace.ns.vocab.schema.Trip.Properties {
    lazy val arrivalStation    = lspace.ns.vocab.schema.arrivalStation.property
    lazy val trainNumber       = lspace.ns.vocab.schema.trainNumber.property
    lazy val trainName         = lspace.ns.vocab.schema.trainName.property
    lazy val departurePlatform = lspace.ns.vocab.schema.departurePlatform.property
  }
}
