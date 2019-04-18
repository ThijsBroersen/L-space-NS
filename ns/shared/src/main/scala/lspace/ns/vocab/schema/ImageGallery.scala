package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ImageGallery
    extends OntologyDef(
      iri = "http://schema.org/ImageGallery",
      iris = Set("http://schema.org/ImageGallery"),
      label = "ImageGallery",
      comment = """Web page type: Image gallery page.""",
      `@extends` = () => List(CollectionPage.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CollectionPage.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CollectionPage.Properties {}
}
