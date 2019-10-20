package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object vehicleTransmission extends PropertyDef(
        iri = "http://schema.org/vehicleTransmission",
        iris = Set("http://schema.org/vehicleTransmission"),
        label = "vehicleTransmission",
        comment = """The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).""",
        `@extends` = List(),
        `@range` = List(`@string`, QualitativeValue.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}