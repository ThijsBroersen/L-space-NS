package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object partOfInvoice
    extends PropertyDef(
      iri = "http://schema.org/partOfInvoice",
      iris = Set("http://schema.org/partOfInvoice"),
      label = "partOfInvoice",
      comment = """The order is being paid as part of the referenced Invoice.""",
      `@extends` = () => List(),
      `@range` = () => List(Invoice.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
