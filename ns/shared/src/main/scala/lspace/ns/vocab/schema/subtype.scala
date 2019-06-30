package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subtype extends PropertyDef(
        iri = "http://schema.org/subtype",
        iris = Set("http://schema.org/subtype"),
        label = "subtype",
        comment = """A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}