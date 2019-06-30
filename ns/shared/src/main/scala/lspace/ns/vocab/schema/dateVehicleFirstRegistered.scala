package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dateVehicleFirstRegistered extends PropertyDef(
        iri = "http://schema.org/dateVehicleFirstRegistered",
        iris = Set("http://schema.org/dateVehicleFirstRegistered"),
        label = "dateVehicleFirstRegistered",
        comment = """The date of the first registration of the vehicle with the respective public authorities.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){
}