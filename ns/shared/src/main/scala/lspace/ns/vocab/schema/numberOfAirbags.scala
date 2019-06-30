package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfAirbags extends PropertyDef(
        iri = "http://schema.org/numberOfAirbags",
        iris = Set("http://schema.org/numberOfAirbags"),
        label = "numberOfAirbags",
        comment = """The number or type of airbags in the vehicle.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, Number.ontology)
       ){
}