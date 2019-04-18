package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ArchiveComponent
    extends OntologyDef(
      iri = "http://schema.org/ArchiveComponent",
      iris = Set("http://schema.org/ArchiveComponent"),
      label = "ArchiveComponent",
      comment =
        """An intangible type to be applied to any archive content, carrying with it a set of properties required to describe archival items and collections.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
