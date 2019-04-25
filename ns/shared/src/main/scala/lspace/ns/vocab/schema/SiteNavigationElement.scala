package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SiteNavigationElement
    extends OntologyDef(
      iri = "http://schema.org/SiteNavigationElement",
      iris = Set("http://schema.org/SiteNavigationElement"),
      label = "SiteNavigationElement",
      comment = """A navigation element of the page.""",
      `@extends` = () => List(WebPageElement.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPageElement.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPageElement.Properties {}
}
