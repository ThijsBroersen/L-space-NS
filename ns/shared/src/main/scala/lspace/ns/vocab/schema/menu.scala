package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object menu
    extends PropertyDef(
      iri = "http://schema.org/menu",
      iris = Set("http://schema.org/menu"),
      label = "menu",
      comment = """Either the actual menu as a structured representation, as text, or a URL of the menu.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology, Text.ontology, Menu.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
