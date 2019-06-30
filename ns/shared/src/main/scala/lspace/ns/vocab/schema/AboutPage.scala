package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AboutPage extends OntologyDef(
        iri = "http://schema.org/AboutPage",
        iris = Set("http://schema.org/AboutPage"),
        label = "AboutPage",
        comment = """Web page type: About page.""",
        `@extends` = () => List(WebPage.ontology)
       ){
}