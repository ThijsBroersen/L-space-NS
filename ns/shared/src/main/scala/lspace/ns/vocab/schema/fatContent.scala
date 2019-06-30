package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object fatContent extends PropertyDef(
        iri = "http://schema.org/fatContent",
        iris = Set("http://schema.org/fatContent"),
        label = "fatContent",
        comment = """The number of grams of fat.""",
        `@extends` = () => List(),
        `@range` = () => List(Mass.ontology)
       ){
}