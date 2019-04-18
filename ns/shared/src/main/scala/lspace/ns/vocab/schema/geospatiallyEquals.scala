package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geospatiallyEquals extends PropertyDef(
        iri = "http://schema.org/geospatiallyEquals",
        iris = Set("http://schema.org/geospatiallyEquals"),
        label = "",
        comment = """""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}