package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object saturatedFatContent extends PropertyDef(
        iri = "http://schema.org/saturatedFatContent",
        iris = Set("http://schema.org/saturatedFatContent"),
        label = "saturatedFatContent",
        comment = """The number of grams of saturated fat.""",
        `@extends` = () => List(),
        `@range` = () => List(Mass.ontology)
       ){
}