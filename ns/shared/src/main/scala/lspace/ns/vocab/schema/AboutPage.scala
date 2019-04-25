package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AboutPage
    extends OntologyDef(
      iri = "http://schema.org/AboutPage",
      iris = Set("http://schema.org/AboutPage"),
      label = "AboutPage",
      comment = """Web page type: About page.""",
      `@extends` = () => List(WebPage.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPage.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPage.Properties {}
}
