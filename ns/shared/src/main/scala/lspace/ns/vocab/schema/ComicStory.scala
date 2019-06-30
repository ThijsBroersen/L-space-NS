package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComicStory extends OntologyDef(
        iri = "http://schema.org/ComicStory",
        iris = Set("http://schema.org/ComicStory"),
        label = "ComicStory",
        comment = """The term "story" is any indivisible, re-printable
    unit of a comic, including the interior stories, covers, and backmatter. Most
    comics have at least two stories: a cover (ComicCoverArt) and an interior story.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}