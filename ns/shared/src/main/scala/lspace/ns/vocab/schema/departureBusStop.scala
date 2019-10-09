package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object departureBusStop extends PropertyDef(
        iri = "http://schema.org/departureBusStop",
        iris = Set("http://schema.org/departureBusStop"),
        label = "departureBusStop",
        comment = """The stop or station from which the bus departs.""",
        `@extends` = List(),
        `@range` = List(BusStop.ontology, BusStation.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}