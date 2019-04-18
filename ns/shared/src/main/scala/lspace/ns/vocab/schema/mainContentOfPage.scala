package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object mainContentOfPage
    extends PropertyDef(
      iri = "http://schema.org/mainContentOfPage",
      iris = Set("http://schema.org/mainContentOfPage"),
      label = "mainContentOfPage",
      comment = """Indicates if this web page element is the main subject of the page.""",
      `@extends` = () => List(),
      `@range` = () => List(WebPageElement.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
