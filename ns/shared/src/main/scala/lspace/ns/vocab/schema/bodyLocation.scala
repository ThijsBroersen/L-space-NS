package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bodyLocation extends PropertyDef(
        iri = "http://schema.org/bodyLocation",
        iris = Set("http://schema.org/bodyLocation"),
        label = "bodyLocation",
        comment = """Location in the body of the anatomical structure.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}