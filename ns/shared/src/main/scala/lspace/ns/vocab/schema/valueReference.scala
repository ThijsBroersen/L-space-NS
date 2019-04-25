package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object valueReference
    extends PropertyDef(
      iri = "http://schema.org/valueReference",
      iris = Set("http://schema.org/valueReference"),
      label = "valueReference",
      comment =
        """A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.""",
      `@extends` = () => List(),
      `@range` = () =>
        List(QuantitativeValue.ontology,
             StructuredValue.ontology,
             QualitativeValue.ontology,
             Enumeration.ontology,
             PropertyValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
