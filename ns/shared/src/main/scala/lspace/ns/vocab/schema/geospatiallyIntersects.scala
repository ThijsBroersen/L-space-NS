package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object geospatiallyIntersects extends PropertyDef(
        iri = "https://schema.org/geospatiallyIntersects",
        iris = Set("https://schema.org/geospatiallyIntersects"),
        label = "geospatiallyIntersects",
        comment = """Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}