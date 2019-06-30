package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object frequency extends PropertyDef(
        iri = "http://schema.org/frequency",
        iris = Set("http://schema.org/frequency"),
        label = "frequency",
        comment = """How often the dose is taken, e.g. 'daily'.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}