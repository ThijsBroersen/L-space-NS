package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoCoveredBy extends PropertyDef(
        iri = "http://schema.org/geoCoveredBy",
        iris = Set("http://schema.org/geoCoveredBy"),
        label = "geoCoveredBy",
        comment = """Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
        `@extends` = List(),
        `@range` = List(Place.ontology, GeospatialGeometry.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}