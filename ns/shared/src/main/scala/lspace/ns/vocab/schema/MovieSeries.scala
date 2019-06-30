package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MovieSeries extends OntologyDef(
        iri = "http://schema.org/MovieSeries",
        iris = Set("http://schema.org/MovieSeries"),
        label = "MovieSeries",
        comment = """A series of movies. Included movies can be indicated with the hasPart property.""",
        `@extends` = () => List(CreativeWorkSeries.ontology)
       ){
}