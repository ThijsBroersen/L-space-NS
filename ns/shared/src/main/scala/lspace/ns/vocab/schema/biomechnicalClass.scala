package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object biomechnicalClass extends PropertyDef(
        iri = "http://schema.org/biomechnicalClass",
        iris = Set("http://schema.org/biomechnicalClass"),
        label = "biomechnicalClass",
        comment = """The biomechanical properties of the bone.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}