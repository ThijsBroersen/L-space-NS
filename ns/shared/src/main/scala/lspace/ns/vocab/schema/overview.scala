package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object overview extends PropertyDef(
        iri = "http://schema.org/overview",
        iris = Set("http://schema.org/overview"),
        label = "overview",
        comment = """Descriptive information establishing the overarching theory/philosophy of the plan. May include the rationale for the name, the population where the plan first came to prominence, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}