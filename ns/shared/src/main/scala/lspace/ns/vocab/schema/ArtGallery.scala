package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ArtGallery extends OntologyDef(
        iri = "http://schema.org/ArtGallery",
        iris = Set("http://schema.org/ArtGallery"),
        label = "ArtGallery",
        comment = """An art gallery.""",
        `@extends` = () => List(EntertainmentBusiness.ontology)
       ){
}