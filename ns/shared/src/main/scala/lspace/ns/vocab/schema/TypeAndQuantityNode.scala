package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TypeAndQuantityNode extends OntologyDef(
        iri = "http://schema.org/TypeAndQuantityNode",
        iris = Set("http://schema.org/TypeAndQuantityNode"),
        label = "TypeAndQuantityNode",
        comment = """A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}