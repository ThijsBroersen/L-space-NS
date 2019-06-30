package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object device extends PropertyDef(
        iri = "http://schema.org/device",
        iris = Set("http://schema.org/device"),
        label = "device",
        comment = """Device required to run the application. Used in cases where a specific make/model is required to run the application.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}