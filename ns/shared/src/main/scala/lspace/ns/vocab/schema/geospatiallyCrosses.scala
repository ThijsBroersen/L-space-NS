package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object geospatiallyCrosses
    extends PropertyDef(
      iri = "http://schema.org/geospatiallyCrosses",
      iris = Set("http://schema.org/geospatiallyCrosses"),
      label = "",
      comment = """""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
