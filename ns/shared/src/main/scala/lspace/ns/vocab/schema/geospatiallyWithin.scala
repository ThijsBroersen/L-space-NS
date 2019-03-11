package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object geospatiallyWithin extends PropertyDef(
        iri = "https://schema.org/geospatiallyWithin",
        iris = Set("https://schema.org/geospatiallyWithin"),
        label = "geospatiallyWithin",
        comment = """Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}