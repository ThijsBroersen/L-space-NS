package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoWithin extends PropertyDef(
        iri = "http://schema.org/geoWithin",
        iris = Set("http://schema.org/geoWithin"),
        label = "geoWithin",
        comment = """Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(GeospatialGeometry.ontology, Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}