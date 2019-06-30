package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ticketNumber extends PropertyDef(
        iri = "http://schema.org/ticketNumber",
        iris = Set("http://schema.org/ticketNumber"),
        label = "ticketNumber",
        comment = """The unique identifier for the ticket.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}