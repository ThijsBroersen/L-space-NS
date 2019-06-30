package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SearchResultsPage extends OntologyDef(
        iri = "http://schema.org/SearchResultsPage",
        iris = Set("http://schema.org/SearchResultsPage"),
        label = "SearchResultsPage",
        comment = """Web page type: Search results page.""",
        `@extends` = () => List(WebPage.ontology)
       ){
}