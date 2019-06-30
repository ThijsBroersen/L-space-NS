package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bodyType extends PropertyDef(
        iri = "http://schema.org/bodyType",
        iris = Set("http://schema.org/bodyType"),
        label = "bodyType",
        comment = """Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, QualitativeValue.ontology, URL.ontology)
       ){
}