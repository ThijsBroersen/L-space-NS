package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object arrivalBusStop
    extends PropertyDef(
      iri = "http://schema.org/arrivalBusStop",
      iris = Set("http://schema.org/arrivalBusStop"),
      label = "arrivalBusStop",
      comment = """The stop or station from which the bus arrives.""",
      `@extends` = () => List(),
      `@range` = () => List(BusStation.ontology, BusStop.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
