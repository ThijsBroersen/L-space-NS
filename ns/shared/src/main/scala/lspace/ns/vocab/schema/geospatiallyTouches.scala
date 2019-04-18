package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object geospatiallyTouches
    extends PropertyDef(
      iri = "http://schema.org/geospatiallyTouches",
      iris = Set("http://schema.org/geospatiallyTouches"),
      label = "",
      comment = """""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
