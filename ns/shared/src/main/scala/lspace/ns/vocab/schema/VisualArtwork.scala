package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VisualArtwork extends OntologyDef(
        iri = "http://schema.org/VisualArtwork",
        iris = Set("http://schema.org/VisualArtwork"),
        label = "VisualArtwork",
        comment = """A work of art that is primarily visual in character.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}