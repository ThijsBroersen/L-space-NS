package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object vehicleModelDate extends PropertyDef(
        iri = "http://schema.org/vehicleModelDate",
        iris = Set("http://schema.org/vehicleModelDate"),
        label = "vehicleModelDate",
        comment = """The release date of a vehicle model (often used to differentiate versions of the same make and model).""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){
}