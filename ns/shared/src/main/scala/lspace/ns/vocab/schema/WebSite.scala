package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WebSite extends OntologyDef(
        iri = "http://schema.org/WebSite",
        iris = Set("http://schema.org/WebSite"),
        label = "WebSite",
        comment = """A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}