package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VideoGallery extends OntologyDef(
        iri = "http://schema.org/VideoGallery",
        iris = Set("http://schema.org/VideoGallery"),
        label = "VideoGallery",
        comment = """Web page type: Video gallery page.""",
        `@extends` = () => List(CollectionPage.ontology)
       ){
}