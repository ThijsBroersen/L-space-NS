package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geospatiallyOverlaps
    extends PropertyDef(
      iri = "http://schema.org/geospatiallyOverlaps",
      iris = Set("http://schema.org/geospatiallyOverlaps"),
      label = "",
      comment = """""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
