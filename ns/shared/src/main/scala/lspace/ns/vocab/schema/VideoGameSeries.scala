package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VideoGameSeries extends OntologyDef(
        iri = "http://schema.org/VideoGameSeries",
        iris = Set("http://schema.org/VideoGameSeries"),
        label = "VideoGameSeries",
        comment = """A video game series.""",
        `@extends` = () => List(CreativeWorkSeries.ontology)
       ){
}