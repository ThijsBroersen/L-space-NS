package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object penciler extends PropertyDef(
        iri = "http://schema.org/penciler",
        iris = Set("http://schema.org/penciler"),
        label = "penciler",
        comment = """The individual who draws the primary narrative artwork.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){
}