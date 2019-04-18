package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object WPSideBar
    extends OntologyDef(
      iri = "http://schema.org/WPSideBar",
      iris = Set("http://schema.org/WPSideBar"),
      label = "WPSideBar",
      comment = """A sidebar section of the page.""",
      `@extends` = () => List(WebPageElement.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPageElement.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPageElement.Properties {}
}
