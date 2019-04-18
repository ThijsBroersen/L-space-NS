package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object geospatiallyWithin
    extends PropertyDef(
      iri = "http://schema.org/geospatiallyWithin",
      iris = Set("http://schema.org/geospatiallyWithin"),
      label = "",
      comment = """""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
