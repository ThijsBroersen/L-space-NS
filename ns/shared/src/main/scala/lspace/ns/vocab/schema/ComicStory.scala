package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ComicStory
    extends OntologyDef(
      iri = "http://schema.org/ComicStory",
      iris = Set("http://schema.org/ComicStory"),
      label = "ComicStory",
      comment = """The term "story" is any indivisible, re-printable
    unit of a comic, including the interior stories, covers, and backmatter. Most
    comics have at least two stories: a cover (ComicCoverArt) and an interior story.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val letterer = lspace.ns.vocab.schema.letterer.property
    lazy val colorist = lspace.ns.vocab.schema.colorist.property
  }
  override lazy val properties: List[Property] = List(letterer, colorist)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val letterer = lspace.ns.vocab.schema.letterer.property
    lazy val colorist = lspace.ns.vocab.schema.colorist.property
  }
}
