package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComicSeries
    extends OntologyDef(
      iri = "http://schema.org/ComicSeries",
      iris = Set("http://schema.org/ComicSeries"),
      label = "ComicSeries",
      comment = """A sequential publication of comic stories under a
    unifying title, for example "The Amazing Spider-Man" or "Groo the
    Wanderer".""",
      `@extends` = () => List(Periodical.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Periodical.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Periodical.Properties {}
}
