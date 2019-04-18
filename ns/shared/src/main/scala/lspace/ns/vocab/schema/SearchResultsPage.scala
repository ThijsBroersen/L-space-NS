package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object SearchResultsPage
    extends OntologyDef(
      iri = "http://schema.org/SearchResultsPage",
      iris = Set("http://schema.org/SearchResultsPage"),
      label = "SearchResultsPage",
      comment = """Web page type: Search results page.""",
      `@extends` = () => List(WebPage.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPage.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPage.Properties {}
}
