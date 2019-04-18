package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object vehicleInteriorColor extends PropertyDef(
        iri = "http://schema.org/vehicleInteriorColor",
        iris = Set("http://schema.org/vehicleInteriorColor"),
        label = "vehicleInteriorColor",
        comment = """The color or color combination of the interior of the vehicle.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}