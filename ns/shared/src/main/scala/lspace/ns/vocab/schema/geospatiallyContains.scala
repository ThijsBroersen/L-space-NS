package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geospatiallyContains
    extends PropertyDef(
      iri = "http://schema.org/geospatiallyContains",
      iris = Set("http://schema.org/geospatiallyContains"),
      label = "",
      comment = """""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
