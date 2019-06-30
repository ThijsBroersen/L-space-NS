package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object departureTerminal extends PropertyDef(
        iri = "http://schema.org/departureTerminal",
        iris = Set("http://schema.org/departureTerminal"),
        label = "departureTerminal",
        comment = """Identifier of the flight's departure terminal.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}