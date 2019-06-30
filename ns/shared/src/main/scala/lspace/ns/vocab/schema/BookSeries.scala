package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BookSeries extends OntologyDef(
        iri = "http://schema.org/BookSeries",
        iris = Set("http://schema.org/BookSeries"),
        label = "BookSeries",
        comment = """A series of books. Included books can be indicated with the hasPart property.""",
        `@extends` = () => List(CreativeWorkSeries.ontology)
       ){
}