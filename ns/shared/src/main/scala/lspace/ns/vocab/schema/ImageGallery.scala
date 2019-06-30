package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ImageGallery extends OntologyDef(
        iri = "http://schema.org/ImageGallery",
        iris = Set("http://schema.org/ImageGallery"),
        label = "ImageGallery",
        comment = """Web page type: Image gallery page.""",
        `@extends` = () => List(CollectionPage.ontology)
       ){
}