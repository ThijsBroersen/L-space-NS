package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QuantitativeValue extends OntologyDef(
        iri = "http://schema.org/QuantitativeValue",
        iris = Set("http://schema.org/QuantitativeValue"),
        label = "QuantitativeValue",
        comment = """A point value or interval for product characteristics and other purposes.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}