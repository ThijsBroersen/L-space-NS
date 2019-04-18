package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object amenityFeature
    extends PropertyDef(
      iri = "http://schema.org/amenityFeature",
      iris = Set("http://schema.org/amenityFeature"),
      label = "amenityFeature",
      comment =
        """An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.""",
      `@extends` = () => List(),
      `@range` = () => List(LocationFeatureSpecification.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
