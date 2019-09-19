package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoContains extends PropertyDef(
        iri = "http://schema.org/geoContains",
        iris = Set("http://schema.org/geoContains"),
        label = "geoContains",
        comment = """Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology, GeospatialGeometry.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}