package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusTrip extends OntologyDef(
        iri = "http://schema.org/BusTrip",
        iris = Set("http://schema.org/BusTrip"),
        label = "BusTrip",
        comment = """A trip on a commercial bus line.""",
        `@extends` = () => List(Trip.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Trip.Properties{
lazy val busNumber = lspace.ns.vocab.schema.busNumber.property
}
override lazy val properties: List[LProperty] = List(busNumber)
trait Properties extends lspace.ns.vocab.schema.Trip.Properties{
lazy val busNumber = lspace.ns.vocab.schema.busNumber.property
}
}