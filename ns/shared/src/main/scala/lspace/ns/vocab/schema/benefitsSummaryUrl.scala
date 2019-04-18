package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object benefitsSummaryUrl
    extends PropertyDef(
      iri = "http://schema.org/benefitsSummaryUrl",
      iris = Set("http://schema.org/benefitsSummaryUrl"),
      label = "benefitsSummaryUrl",
      comment =
        """The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
