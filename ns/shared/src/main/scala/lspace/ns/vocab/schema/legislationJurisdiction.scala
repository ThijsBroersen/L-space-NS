package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object legislationJurisdiction
    extends PropertyDef(
      iri = "http://schema.org/legislationJurisdiction",
      iris = Set("http://schema.org/legislationJurisdiction"),
      label = "legislationJurisdiction",
      comment = """The jurisdiction from which the legislation originates.""",
      `@extends` = () => List(spatialCoverage.property),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.spatialCoverage.Properties
}
