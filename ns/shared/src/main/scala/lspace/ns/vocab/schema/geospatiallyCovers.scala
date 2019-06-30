package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geospatiallyCovers extends PropertyDef(
        iri = "http://schema.org/geospatiallyCovers",
        iris = Set("http://schema.org/geospatiallyCovers"),
        label = "",
        comment = """""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}