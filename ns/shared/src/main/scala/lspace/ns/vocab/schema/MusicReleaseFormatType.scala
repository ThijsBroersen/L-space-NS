package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MusicReleaseFormatType
    extends OntologyDef(
      iri = "http://schema.org/MusicReleaseFormatType",
      iris = Set("http://schema.org/MusicReleaseFormatType"),
      label = "MusicReleaseFormatType",
      comment =
        """Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {}
}
