package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WebPageElement extends OntologyDef(
        iri = "http://schema.org/WebPageElement",
        iris = Set("http://schema.org/WebPageElement"),
        label = "WebPageElement",
        comment = """A web page element, like a table or an image.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}