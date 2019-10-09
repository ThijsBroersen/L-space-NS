package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object departureStation extends PropertyDef(
        iri = "http://schema.org/departureStation",
        iris = Set("http://schema.org/departureStation"),
        label = "departureStation",
        comment = """The station from which the train departs.""",
        `@extends` = List(),
        `@range` = List(TrainStation.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}