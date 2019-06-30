package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object costPerUnit extends PropertyDef(
        iri = "http://schema.org/costPerUnit",
        iris = Set("http://schema.org/costPerUnit"),
        label = "costPerUnit",
        comment = """The cost per unit of the drug.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology, QualitativeValue.ontology, Text.ontology)
       ){
}