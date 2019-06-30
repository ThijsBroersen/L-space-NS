package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoCovers extends PropertyDef(
        iri = "http://schema.org/geoCovers",
        iris = Set("http://schema.org/geoCovers"),
        label = "geoCovers",
        comment = """Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(GeospatialGeometry.ontology, Place.ontology)
       ){
}