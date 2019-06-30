package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CollectionPage extends OntologyDef(
        iri = "http://schema.org/CollectionPage",
        iris = Set("http://schema.org/CollectionPage"),
        label = "CollectionPage",
        comment = """Web page type: Collection page.""",
        `@extends` = () => List(WebPage.ontology)
       ){
}