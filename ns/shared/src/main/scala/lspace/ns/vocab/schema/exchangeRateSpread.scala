package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object exchangeRateSpread
    extends PropertyDef(
      iri = "http://schema.org/exchangeRateSpread",
      iris = Set("http://schema.org/exchangeRateSpread"),
      label = "exchangeRateSpread",
      comment =
        """The difference between the price at which a broker or other intermediary buys and sells foreign currency.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, MonetaryAmount.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
