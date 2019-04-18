package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object GeospatialGeometry
    extends OntologyDef(
      iri = "http://schema.org/GeospatialGeometry",
      iris = Set("http://schema.org/GeospatialGeometry"),
      label = "GeospatialGeometry",
      comment =
        """(Eventually to be defined as) a supertype of GeoShape designed to accommodate definitions from Geo-Spatial best practices.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val geoCoveredBy  = lspace.ns.vocab.schema.geoCoveredBy.property
    lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects.property
  }
  override lazy val properties: List[Property] = List(geoCoveredBy, geoIntersects)
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {
    lazy val geoCoveredBy  = lspace.ns.vocab.schema.geoCoveredBy.property
    lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects.property
  }
}
