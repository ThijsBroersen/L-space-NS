package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object numAdults
    extends PropertyDef(
      iri = "http://schema.org/numAdults",
      iris = Set("http://schema.org/numAdults"),
      label = "numAdults",
      comment = """The number of adults staying in the unit.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
