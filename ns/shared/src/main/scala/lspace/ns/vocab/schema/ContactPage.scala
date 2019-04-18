package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ContactPage
    extends OntologyDef(
      iri = "http://schema.org/ContactPage",
      iris = Set("http://schema.org/ContactPage"),
      label = "ContactPage",
      comment = """Web page type: Contact page.""",
      `@extends` = () => List(WebPage.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPage.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPage.Properties {}
}
