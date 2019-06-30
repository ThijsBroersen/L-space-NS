package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object flightDistance extends PropertyDef(
        iri = "http://schema.org/flightDistance",
        iris = Set("http://schema.org/flightDistance"),
        label = "flightDistance",
        comment = """The distance of the flight.""",
        `@extends` = () => List(),
        `@range` = () => List(Distance.ontology, Text.ontology)
       ){
}