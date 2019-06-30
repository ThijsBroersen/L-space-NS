package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Barcode extends OntologyDef(
        iri = "http://schema.org/Barcode",
        iris = Set("http://schema.org/Barcode"),
        label = "Barcode",
        comment = """An image of a visual machine-readable code such as a barcode or QR code.""",
        `@extends` = () => List(ImageObject.ontology)
       ){
}