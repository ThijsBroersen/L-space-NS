package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geospatiallyIntersects extends PropertyDef(
        iri = "http://schema.org/geospatiallyIntersects",
        iris = Set("http://schema.org/geospatiallyIntersects"),
        label = "",
        comment = """""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}