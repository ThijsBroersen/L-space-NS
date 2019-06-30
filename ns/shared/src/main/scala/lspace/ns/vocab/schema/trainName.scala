package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object trainName extends PropertyDef(
        iri = "http://schema.org/trainName",
        iris = Set("http://schema.org/trainName"),
        label = "trainName",
        comment = """The name of the train (e.g. The Orient Express).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}