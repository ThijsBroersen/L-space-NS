package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WebPage extends OntologyDef(
        iri = "http://schema.org/WebPage",
        iris = Set("http://schema.org/WebPage"),
        label = "WebPage",
        comment = """A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}