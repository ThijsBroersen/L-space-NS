package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeospatialGeometry extends OntologyDef(
        iri = "http://schema.org/GeospatialGeometry",
        iris = Set("http://schema.org/GeospatialGeometry"),
        label = "GeospatialGeometry",
        comment = """(Eventually to be defined as) a supertype of GeoShape designed to accommodate definitions from Geo-Spatial best practices.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val geoContains = lspace.ns.vocab.schema.geoContains.property
lazy val geoCoveredBy = lspace.ns.vocab.schema.geoCoveredBy.property
lazy val geoCovers = lspace.ns.vocab.schema.geoCovers.property
lazy val geoCrosses = lspace.ns.vocab.schema.geoCrosses.property
lazy val geoDisjoint = lspace.ns.vocab.schema.geoDisjoint.property
lazy val geoEquals = lspace.ns.vocab.schema.geoEquals.property
lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects.property
lazy val geoOverlaps = lspace.ns.vocab.schema.geoOverlaps.property
lazy val geoTouches = lspace.ns.vocab.schema.geoTouches.property
lazy val geoWithin = lspace.ns.vocab.schema.geoWithin.property
}
override lazy val properties: List[LProperty] = List(geoContains, geoCoveredBy, geoCovers, geoCrosses, geoDisjoint, geoEquals, geoIntersects, geoOverlaps, geoTouches, geoWithin)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val geoContains = lspace.ns.vocab.schema.geoContains.property
lazy val geoCoveredBy = lspace.ns.vocab.schema.geoCoveredBy.property
lazy val geoCovers = lspace.ns.vocab.schema.geoCovers.property
lazy val geoCrosses = lspace.ns.vocab.schema.geoCrosses.property
lazy val geoDisjoint = lspace.ns.vocab.schema.geoDisjoint.property
lazy val geoEquals = lspace.ns.vocab.schema.geoEquals.property
lazy val geoIntersects = lspace.ns.vocab.schema.geoIntersects.property
lazy val geoOverlaps = lspace.ns.vocab.schema.geoOverlaps.property
lazy val geoTouches = lspace.ns.vocab.schema.geoTouches.property
lazy val geoWithin = lspace.ns.vocab.schema.geoWithin.property
}
}