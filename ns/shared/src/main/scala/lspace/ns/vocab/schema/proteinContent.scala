package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object proteinContent extends PropertyDef(
        iri = "http://schema.org/proteinContent",
        iris = Set("http://schema.org/proteinContent"),
        label = "proteinContent",
        comment = """The number of grams of protein.""",
        `@extends` = () => List(),
        `@range` = () => List(Mass.ontology)
       ){
}