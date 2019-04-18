package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object QualitativeValue
    extends OntologyDef(
      iri = "http://schema.org/QualitativeValue",
      iris = Set("http://schema.org/QualitativeValue"),
      label = "QualitativeValue",
      comment =
        """A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {
    lazy val valueReference     = lspace.ns.vocab.schema.valueReference.property
    lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
    lazy val lesserOrEqual      = lspace.ns.vocab.schema.lesserOrEqual.property
    lazy val greaterOrEqual     = lspace.ns.vocab.schema.greaterOrEqual.property
    lazy val nonEqual           = lspace.ns.vocab.schema.nonEqual.property
  }
  override lazy val properties: List[Property] =
    List(valueReference, additionalProperty, lesserOrEqual, greaterOrEqual, nonEqual)
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {
    lazy val valueReference     = lspace.ns.vocab.schema.valueReference.property
    lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
    lazy val lesserOrEqual      = lspace.ns.vocab.schema.lesserOrEqual.property
    lazy val greaterOrEqual     = lspace.ns.vocab.schema.greaterOrEqual.property
    lazy val nonEqual           = lspace.ns.vocab.schema.nonEqual.property
  }
}
