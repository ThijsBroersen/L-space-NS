package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object fuelType extends PropertyDef(
        iri = "http://schema.org/fuelType",
        iris = Set("http://schema.org/fuelType"),
        label = "fuelType",
        comment = """The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.""",
        `@extends` = List(),
        `@range` = List(URL.ontology, `@string`, QualitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}