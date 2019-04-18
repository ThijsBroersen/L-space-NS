package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object WPFooter
    extends OntologyDef(
      iri = "http://schema.org/WPFooter",
      iris = Set("http://schema.org/WPFooter"),
      label = "WPFooter",
      comment = """The footer section of the page.""",
      `@extends` = () => List(WebPageElement.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPageElement.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPageElement.Properties {}
}
