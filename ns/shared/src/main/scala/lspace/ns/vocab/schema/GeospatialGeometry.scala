package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeospatialGeometry extends OntologyDef(
        iri = "http://schema.org/GeospatialGeometry",
        iris = Set("http://schema.org/GeospatialGeometry"),
        label = "GeospatialGeometry",
        comment = """(Eventually to be defined as) a supertype of GeoShape designed to accommodate definitions from Geo-Spatial best practices.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}