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
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val minValue = lspace.ns.vocab.schema.minValue.property
}
override lazy val properties: List[LProperty] = List(minValue)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val minValue = lspace.ns.vocab.schema.minValue.property
}
}