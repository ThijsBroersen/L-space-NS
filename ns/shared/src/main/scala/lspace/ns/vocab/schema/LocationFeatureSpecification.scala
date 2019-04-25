package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LocationFeatureSpecification
    extends OntologyDef(
      iri = "http://schema.org/LocationFeatureSpecification",
      iris = Set("http://schema.org/LocationFeatureSpecification"),
      label = "LocationFeatureSpecification",
      comment =
        """Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.""",
      `@extends` = () => List(PropertyValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PropertyValue.Properties {
    lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
    lazy val validFrom    = lspace.ns.vocab.schema.validFrom.property
  }
  override lazy val properties: List[LProperty] = List(validThrough, validFrom)
  trait Properties extends lspace.ns.vocab.schema.PropertyValue.Properties {
    lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
    lazy val validFrom    = lspace.ns.vocab.schema.validFrom.property
  }
}
