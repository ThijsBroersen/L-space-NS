package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CoverArt extends OntologyDef(
        iri = "http://schema.org/CoverArt",
        iris = Set("http://schema.org/CoverArt"),
        label = "CoverArt",
        comment = """The artwork on the outer surface of a CreativeWork.""",
        `@extends` = () => List(VisualArtwork.ontology)
       ){
}