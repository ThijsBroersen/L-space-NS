package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComicCoverArt extends OntologyDef(
        iri = "http://schema.org/ComicCoverArt",
        iris = Set("http://schema.org/ComicCoverArt"),
        label = "ComicCoverArt",
        comment = """The artwork on the cover of a comic.""",
        `@extends` = () => List(ComicStory.ontology, CoverArt.ontology)
       ){
}