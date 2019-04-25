package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object propertyID
    extends PropertyDef(
      iri = "http://schema.org/propertyID",
      iris = Set("http://schema.org/propertyID"),
      label = "propertyID",
      comment =
        """A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
(1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
Standards bodies should promote a standard prefix for the identifiers of properties from their standards.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
