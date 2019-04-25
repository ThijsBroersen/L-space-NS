package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object datasetTimeInterval
    extends PropertyDef(
      iri = "http://schema.org/datasetTimeInterval",
      iris = Set("http://schema.org/datasetTimeInterval"),
      label = "datasetTimeInterval",
      comment =
        """The range of temporal applicability of a dataset, e.g. for a 2011 census dataset, the year 2011 (in ISO 8601 time interval format).""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
