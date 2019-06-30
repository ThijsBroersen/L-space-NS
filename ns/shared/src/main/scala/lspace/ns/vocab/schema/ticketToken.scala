package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ticketToken extends PropertyDef(
        iri = "http://schema.org/ticketToken",
        iris = Set("http://schema.org/ticketToken"),
        label = "ticketToken",
        comment = """Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, Text.ontology)
       ){
}