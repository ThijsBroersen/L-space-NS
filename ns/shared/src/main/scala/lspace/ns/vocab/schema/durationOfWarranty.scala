package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object durationOfWarranty
    extends PropertyDef(
      iri = "http://schema.org/durationOfWarranty",
      iris = Set("http://schema.org/durationOfWarranty"),
      label = "durationOfWarranty",
      comment =
        """The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
