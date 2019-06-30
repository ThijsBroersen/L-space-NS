package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object option extends PropertyDef(
        iri = "http://schema.org/option",
        iris = Set("http://schema.org/option"),
        label = "option",
        comment = """A sub property of object. The options subject to this action.""",
        `@extends` = () => List(`object`.property),
        `@range` = () => List(Thing.ontology, Text.ontology)
       ){
}