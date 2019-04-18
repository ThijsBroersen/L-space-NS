package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Barcode
    extends OntologyDef(
      iri = "http://schema.org/Barcode",
      iris = Set("http://schema.org/Barcode"),
      label = "Barcode",
      comment = """An image of a visual machine-readable code such as a barcode or QR code.""",
      `@extends` = () => List(ImageObject.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ImageObject.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.ImageObject.Properties {}
}
