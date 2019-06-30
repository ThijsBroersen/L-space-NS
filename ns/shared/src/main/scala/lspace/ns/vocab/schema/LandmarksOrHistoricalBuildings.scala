package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LandmarksOrHistoricalBuildings extends OntologyDef(
        iri = "http://schema.org/LandmarksOrHistoricalBuildings",
        iris = Set("http://schema.org/LandmarksOrHistoricalBuildings"),
        label = "LandmarksOrHistoricalBuildings",
        comment = """An historical landmark or building.""",
        `@extends` = () => List(Place.ontology)
       ){
}