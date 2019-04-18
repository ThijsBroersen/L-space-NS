package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object partOfTVSeries
    extends PropertyDef(
      iri = "http://schema.org/partOfTVSeries",
      iris = Set("http://schema.org/partOfTVSeries"),
      label = "partOfTVSeries",
      comment = """The TV series to which this episode or season belongs.""",
      `@extends` = () => List(isPartOf.property),
      `@range` = () => List(TVSeries.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.isPartOf.Properties
}
