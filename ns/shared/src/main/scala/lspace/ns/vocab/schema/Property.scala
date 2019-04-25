package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Property
    extends OntologyDef(
      iri = "http://schema.org/Property",
      iris = Set("http://schema.org/Property"),
      label = "Property",
      comment =
        """A property, used to indicate attributes and relationships of some Thing; equivalent to rdf:Property.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val supersededBy   = lspace.ns.vocab.schema.supersededBy.property
    lazy val domainIncludes = lspace.ns.vocab.schema.domainIncludes.property
  }
  override lazy val properties: List[LProperty] = List(supersededBy, domainIncludes)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val supersededBy   = lspace.ns.vocab.schema.supersededBy.property
    lazy val domainIncludes = lspace.ns.vocab.schema.domainIncludes.property
  }
}
