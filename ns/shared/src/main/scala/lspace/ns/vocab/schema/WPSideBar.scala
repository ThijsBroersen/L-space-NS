package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WPSideBar extends OntologyDef(
        iri = "http://schema.org/WPSideBar",
        iris = Set("http://schema.org/WPSideBar"),
        label = "WPSideBar",
        comment = """A sidebar section of the page.""",
        `@extends` = () => List(WebPageElement.ontology)
       ){
}