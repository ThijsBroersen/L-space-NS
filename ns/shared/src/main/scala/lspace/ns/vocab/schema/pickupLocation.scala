package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object pickupLocation extends PropertyDef(
        iri = "http://schema.org/pickupLocation",
        iris = Set("http://schema.org/pickupLocation"),
        label = "pickupLocation",
        comment = """Where a taxi will pick up a passenger or a rental car can be picked up.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){
}