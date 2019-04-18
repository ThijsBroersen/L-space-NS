package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object arrivalStation
    extends PropertyDef(
      iri = "http://schema.org/arrivalStation",
      iris = Set("http://schema.org/arrivalStation"),
      label = "arrivalStation",
      comment = """The station where the train trip ends.""",
      `@extends` = () => List(),
      `@range` = () => List(TrainStation.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
