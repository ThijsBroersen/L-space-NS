package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComicCoverArt
    extends OntologyDef(
      iri = "http://schema.org/ComicCoverArt",
      iris = Set("http://schema.org/ComicCoverArt"),
      label = "ComicCoverArt",
      comment = """The artwork on the cover of a comic.""",
      `@extends` = () => List(ComicStory.ontology, CoverArt.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ComicStory.Properties with lspace.ns.vocab.schema.CoverArt.Properties {

    override lazy val colorist = lspace.ns.vocab.schema.colorist.property
    override lazy val letterer = lspace.ns.vocab.schema.letterer.property
  }
  override lazy val properties: List[LProperty] = List()
  trait Properties
      extends lspace.ns.vocab.schema.ComicStory.Properties
      with lspace.ns.vocab.schema.CoverArt.Properties {

    override lazy val colorist = lspace.ns.vocab.schema.colorist.property
    override lazy val letterer = lspace.ns.vocab.schema.letterer.property
  }
}
