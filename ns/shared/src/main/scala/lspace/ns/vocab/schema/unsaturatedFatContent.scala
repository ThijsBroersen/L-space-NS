package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object unsaturatedFatContent extends PropertyDef(
        iri = "http://schema.org/unsaturatedFatContent",
        iris = Set("http://schema.org/unsaturatedFatContent"),
        label = "unsaturatedFatContent",
        comment = """The number of grams of unsaturated fat.""",
        `@extends` = () => List(),
        `@range` = () => List(Mass.ontology)
       ){
}