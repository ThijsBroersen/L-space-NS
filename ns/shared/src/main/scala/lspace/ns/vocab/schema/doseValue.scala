package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object doseValue extends PropertyDef(
        iri = "http://schema.org/doseValue",
        iris = Set("http://schema.org/doseValue"),
        label = "doseValue",
        comment = """The value of the dose, e.g. 500.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology, QualitativeValue.ontology)
       ){
}