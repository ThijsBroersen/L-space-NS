package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object engineType extends PropertyDef(
        iri = "http://schema.org/engineType",
        iris = Set("http://schema.org/engineType"),
        label = "engineType",
        comment = """The type of engine or engines powering the vehicle.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, Text.ontology, QualitativeValue.ontology)
       ){
}