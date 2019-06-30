package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geospatiallyCoveredBy extends PropertyDef(
        iri = "http://schema.org/geospatiallyCoveredBy",
        iris = Set("http://schema.org/geospatiallyCoveredBy"),
        label = "",
        comment = """""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}