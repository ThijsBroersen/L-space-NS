package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeoShape extends OntologyDef(
        iri = "http://schema.org/GeoShape",
        iris = Set("http://schema.org/GeoShape"),
        label = "GeoShape",
        comment = """The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
}