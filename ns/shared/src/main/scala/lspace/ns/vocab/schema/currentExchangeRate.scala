package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object currentExchangeRate
    extends PropertyDef(
      iri = "http://schema.org/currentExchangeRate",
      iris = Set("http://schema.org/currentExchangeRate"),
      label = "currentExchangeRate",
      comment = """The current price of a currency.""",
      `@extends` = () => List(),
      `@range` = () => List(UnitPriceSpecification.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
