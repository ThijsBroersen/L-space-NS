package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WPFooter extends OntologyDef(
        iri = "http://schema.org/WPFooter",
        iris = Set("http://schema.org/WPFooter"),
        label = "WPFooter",
        comment = """The footer section of the page.""",
        `@extends` = () => List(WebPageElement.ontology)
       ){
}